package com.example.a96346.fengguoqiyuekao1512r;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PullToRefreshListView pullToRefreshListView;
List<JavaBean.NewslistBean> list=new ArrayList();
    private Myadapter myadapter;
    int pager=0;
    public String urlString = "http://api.tianapi.com/huabian/?key=71e58b5b2f930eaf1f937407acde08fe&num=?";
   
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what ==1) {
                Gson gson = new Gson();
                zsgc.insrert((String) msg.obj,urlString+pager);
                JavaBean javaBean = gson.fromJson((String) msg.obj, JavaBean.class);
                List<JavaBean.NewslistBean> newslist = javaBean.getNewslist();
                list.addAll(newslist);
                myadapter.notifyDataSetChanged();
                pullToRefreshListView.onRefreshComplete();

            }
        }
    };

private  zsgc zsgc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pullToRefreshListView = (PullToRefreshListView) findViewById(R.id.pull);
        pullToRefreshListView.setMode(PullToRefreshBase.Mode.BOTH);
        zsgc = new zsgc(MainActivity.this);
        myadapter = new Myadapter();
        pullToRefreshListView.setAdapter(myadapter);
        getData(0);
//监听事件
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> pullToRefreshBase) {
                list.clear();
                getData(0);
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> pullToRefreshBase) {
pager++;
getData(pager);
            }
        });
    }
//获取数据
    private void getData(final int pager) {
        if (NetStateUtil.isConn(this)){
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    String netjson = NetWordUtils.getNetjson(urlString+pager);
                    Message message = handler.obtainMessage();message.what=1;
                    message.obj=netjson;

                    handler.sendMessage(message);
                }
            }.start();
        }else{
            String qurell = zsgc.qurell(urlString + pager);
            if (!qurell.isEmpty()){
                Gson gson = new Gson();
                JavaBean javaBean = gson.fromJson(qurell, JavaBean.class);
                List<JavaBean.NewslistBean> newslist = javaBean.getNewslist();
                list.addAll(newslist);
                myadapter.notifyDataSetChanged();
                pullToRefreshListView.onRefreshComplete();
            }

        }

    }

    //适配器
    private class Myadapter extends BaseAdapter{
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //进行优化
            ViewHoder hoder;
            if (view==null){
                view=View.inflate(MainActivity.this,R.layout.list,null);
                hoder=new ViewHoder();
                hoder.tit=view.findViewById(R.id.tit);
                hoder.img=view.findViewById(R.id.img);
                view.setTag(hoder);
            }else{
              hoder= (ViewHoder) view.getTag();
            }
            hoder.tit.setText(list.get(i).getTitle());
            ImageLoader.getInstance().displayImage(list.get(i).getPicUrl(),hoder.img);
            return view;
        }
        class  ViewHoder{
            ImageView img;
            TextView tit;
        }
    }
}
