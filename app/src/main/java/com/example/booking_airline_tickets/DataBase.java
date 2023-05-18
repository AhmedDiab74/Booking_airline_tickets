package com.example.booking_airline_tickets;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {
    private Context context;
    public static final String DB_name ="BookTicket.db";
    public static final int DB_version =1;
    public static final String users_table = "users";
    public static final String flights_table="flights";

    public DataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_name, null, DB_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table1 = "CREATE TABLE "+users_table+"id INTEGER PRIMARY KEY,user_name TEXT,Password TEXT,id_flight INTEGER";
        String table2 = "CREATE TABLE "+flights_table+"id INTEGER PRIMARY KEY,take_off TEXT,landing TEXT,start_time INTEGER,end_time INTEGER,price INTEGER";
        db.execSQL(table1);
        db.execSQL(table2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+users_table);
        db.execSQL("DROP TABLE IF EXISTS "+flights_table);
        onCreate(db);

    }
}
