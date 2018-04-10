package com.example.a96346.fengguoqiyuekao1512r;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;


//ImageLoaderConfiguration配置类
public class Mapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration build = new ImageLoaderConfiguration.Builder(this)
                .memoryCacheSize(100)
                .memoryCacheExtraOptions(480, 800)

                .build();

        ImageLoader.getInstance().init(build);
    }
}
