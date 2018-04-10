package com.example.a96346.fengguoqiyuekao1512r;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class NetStateUtil {


    public static boolean isConn(Context context){
        boolean bisConnFlag=false;
        ConnectivityManager conManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo network = conManager.getActiveNetworkInfo();
        if(network!=null){
            bisConnFlag=conManager.getActiveNetworkInfo().isAvailable();
        }
        return bisConnFlag;
    }

//    /**
//     * 当判断当前手机没有网络时选择是否打开网络设置
//     * @param context
//     */
//    public static void showNoNetWorkDlg(final Context context) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(context);
//        builder.setIcon(R.mipmap.ic_launcher)         //
//                .setTitle(R.string.app_name)            //
//                .setMessage("当前无网络").setPositiveButton("设置", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // 跳转到系统的网络设置界面
//                Intent intent = null;
//                // 先判断当前系统版本
//                if(android.os.Build.VERSION.SDK_INT > 10){  // 3.0以上
//                    intent = new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS);
//                }else{
//                    intent = new Intent();
//                    intent.setClassName("com.android.settings", "com.android.settings.WirelessSettings");
//                }
//                context.startActivity(intent);
//
//            }
//        }).setNegativeButton("知道了", null).show();
//    }
}
