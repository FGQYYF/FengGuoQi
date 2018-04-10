package com.example.a96346.fengguoqiyuekao1512r;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class zsgc {

    private static Sqlite sqlite = null;

    public zsgc(Context context) {
        sqlite = new Sqlite(context);
    }
    public static void insrert(String json, String uri){
        SQLiteDatabase writableDatabase = sqlite.getWritableDatabase();
        writableDatabase.delete("info","url=?",new String[]{uri});
        ContentValues contentValues = new ContentValues();contentValues.put("url",uri);
        contentValues.put("json",json);
        long info = writableDatabase.insert("info", null, contentValues);
        Log.i("--++",info+"");

    }
    public static String qurell(String uri){
        SQLiteDatabase writableDatabase = sqlite.getWritableDatabase();
        Cursor info = writableDatabase.query("info", null, "url=?", new String[]{uri}, null, null, null, null);
        while (info.moveToNext()){
            String json = info.getString(info.getColumnIndex("json"));
            Log.i("--++",json);
            return json;

        }
        return "";
    }

}
