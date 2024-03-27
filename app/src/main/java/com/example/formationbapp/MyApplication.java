package com.example.formationbapp;

import android.app.Application;
import android.util.Log;

import com.example.formationbapp.dao.DatabaseHelper;

public class MyApplication extends Application {
    private static DatabaseHelper dbHelper ;
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialiser votre base de données ici
        dbHelper = new DatabaseHelper(this);
        Log.i("data", dbHelper.getDatabaseName());
        dbHelper.getWritableDatabase();

    }
    public static DatabaseHelper getDbHelper() {
        return dbHelper;
    }
    public static void setDbHelper(DatabaseHelper dbHelper) {
        MyApplication.dbHelper = dbHelper;
    }
}

