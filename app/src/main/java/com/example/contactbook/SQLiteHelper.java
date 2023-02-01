package com.example.contactbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.os.Bundle;

public class SQLiteHelper extends AppCompatActivity {

    private static SQLiteHelper sqLiteHelper;

    private static final String DATABASE_NAME = "ContactInfo";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "Contacts";
    private static final String COUNTER = "Counter";

    private static final String ID_FIELD = "id";
    private static final String LASTNAME_FIELD = "Last Name";

    private static final String FIRSTNAME_FIELD = "First Name";
    private static final String PHONE_NUMBER = "Number";
    private static final String DELETED_FIELD = "deleted";


    /*public SQLiteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }*/

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        StringBuilder sql;
        sql = new StringBuilder()
                .append("CREATE TABLE ")
                .append(TABLE_NAME)
                .append("(")
                .append(COUNTER)
                .append(" INTEGER PRIMARY KEY AUTOINCREMENT, ")
                .append(ID_FIELD)
                .append(" INT, ")
                .append(FIRSTNAME_FIELD)
                .append(" TEXT, ")
                .append(LASTNAME_FIELD)
                .append(" TEXT, ")
                .append(PHONE_NUMBER)
                .append(" TEXT, ")
                .append(DELETED_FIELD)
                .append(" TEXT)");

        sqLiteDatabase.execSQL(sql.toString());
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }
}