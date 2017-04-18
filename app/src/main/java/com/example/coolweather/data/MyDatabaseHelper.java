package com.example.coolweather.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.SyncStateContract;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/4/18.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper{

    //创建city数据库
//    public static final String CREATER_CITY = "create table City("
//            +"id integer primary key autoincrement,"
//            +"cityName text"
//            +"weatherId text"
//            +"cityId integer";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, Context mContext) {
        super(context, name, factory, version);
        this.mContext = mContext;
    }

    public MyDatabaseHelper(Context context){
        super(context,Constant.TABLE_NAME,null,Constant.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table "+Constant.TABLE_NAME
                +"("+Constant._Id+" Integer primary key autoincrement,"+Constant.CITY_NAME+
                " Varchar(10),"+Constant.WEATHER_ID+" Nvarchar,"+Constant.CITY_ID+" Integer)";
        db.execSQL(sql);
//        Toast.makeText(mContext,"Create succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
