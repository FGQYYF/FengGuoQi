package com.example.a96346.fengguoqiyuekao1512r;

import java.util.List;

/**
 * Created by 96346 on 2018/4/7.
 */

public class Result {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-12-12 23:19","title":"冯小刚《芳华》将首映 葛优为其打call力挺","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/af69b4e095d44c49be0b8cd4a412292b20171212220318.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G4VJMM00038FO9.html"},{"ctime":"2017-12-12 23:19","title":"GAI央视彩排现场隔空表白女友 表示快要结婚了","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/be447f9034574827be379f4d315136fa20171212220506.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G537LK00038FO9.html"},{"ctime":"2017-12-12 23:19","title":"张惠妹听闻前绯闻男友婚变 \u201c睁大双眼\u201d尴尬回应","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/7bac0e22fa2341c4af7ec8b046a3f30020171212221810.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G5QQR300038FO9.html"},{"ctime":"2017-12-12 22:03","title":"独家：曹云金隔空喊话郭德纲：父不义，子奔他乡","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/0b443724c1f2498d965975c050ad01fa20171212124757.jpeg_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G5V5EN00039840.html"},{"ctime":"2017-12-12 22:05","title":"窦靖童出家？工作室：仅仅是剪掉头发 与出家无关","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/46c03c8895f84941b4210ec085a4bf6d20171212231120.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/23/D5G8SM0200038FO9.html"},{"ctime":"2017-12-12 22:18","title":"王鸥电影杀青喊话包贝尔：来，亲一个","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/catchpic/4/4a/4abdb595d7c651ece5d3a04d538a49b2.gif_180x125x1x85.jpg","url":"http://ent.163.com/16/1213/09/C85I1GT50003803T.html"},{"ctime":"2017-12-12 22:20","title":"刘晓庆豪华别墅曝光生活惬意","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img3.cache.netease.com/photo/0003/2016-12-13/t_C85HC0IP00AJ0003.jpg_180x125x1x85.jpg","url":"http://ent.163.com/16/1213/09/C85HRBVJ0003803T.html"},{"ctime":"2017-12-12 23:11","title":"周冬雨晒自拍粉色内裤抢镜","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/c8bce039b5ed4528bd42859a4846774220161213093854.png_180x125x1x85.jpg","url":"http://ent.163.com/16/1213/09/C85HMUVH0003803T.html"},{"ctime":"2017-10-31 14:44","title":"《米花之味》入围平遥国际电影节 贾樟柯助阵","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/718ee04ecad44abf9f9827ceb8c5140c20171031163232.jpeg","url":"http://ent.163.com/17/1031/14/D2375PVT00038793.html"},{"ctime":"2017-10-31 14:46","title":"《请赐我一双翅膀》朱圣t首演民国剧搭档炎亚纶","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/77e1284bd2fe40d0ad4b1367d852b69d20171031144720.jpeg","url":"http://ent.163.com/17/1031/14/D237A02Q00038793.html"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-12-12 23:19
         * title : 冯小刚《芳华》将首映 葛优为其打call力挺
         * description : 网易明星
         * picUrl : http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/af69b4e095d44c49be0b8cd4a412292b20171212220318.png_130x90x1x85.jpg
         * url : http://ent.163.com/17/1212/22/D5G4VJMM00038FO9.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
