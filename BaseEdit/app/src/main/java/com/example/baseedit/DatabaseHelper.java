package com.example.baseedit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    String sqlCreate="CREATE TABLE Alumnos(no_control INTEGER,nombre TEXT,aPaterno TEXT,aMaterno TEXT);";

    public DatabaseHelper(Context context, String nombre, SQLiteDatabase.CursorFactory factory, int version ){
        super(context, nombre, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {db.execSQL(sqlCreate); }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists Alumnos");
        db.execSQL(sqlCreate);

    }
}