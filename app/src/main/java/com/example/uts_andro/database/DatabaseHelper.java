package com.example.uts_andro.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.uts_andro.TambahDataActivity;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static String _NAMA_DATABASE = "db_data_alumni";
    public static int _VERSION = 1;
    public static String _CREATE_TABLE = "create table tb_data_alumni (id INTEGER PRIMARY KEY AUTOINCREMENT," + "nim TEXT, nama TEXT, tempat_lahir TEXT, tgl_lahir TEXT, alamat TEXT, agama TEXT, tlp TEXT, thn_masuk TEXT, thn_lulus TEXT, pekerjaan TEXT, jabatan TEXT)";

    public DatabaseHelper(@Nullable Context context) {
        super(context, _NAMA_DATABASE, null, _VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
