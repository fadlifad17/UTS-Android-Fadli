package com.example.uts_andro;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uts_andro.adapter.AdapterDataAlumni;
import com.example.uts_andro.database.DatabaseHelper;
import com.example.uts_andro.model.AlumniModel;

import java.util.ArrayList;

public class DataAlumniActivity extends AppCompatActivity {

    AdapterDataAlumni adapterDataAlumni;
    ListView listDataAlumni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_alumni);

        listDataAlumni = findViewById(R.id.listDataAlumni);
        adapterDataAlumni = new AdapterDataAlumni(this, R.layout.layout_list_alumni);
        listDataAlumni.setAdapter(adapterDataAlumni);

        listDataAlumni.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlumniModel model = (AlumniModel) adapterView.getAdapter().getItem(i);
                Intent intent = new Intent(DataAlumniActivity.this, DetailDataAlumniActivity.class);

                intent.putExtra("id", model.getId());
                intent.putExtra("nim", model.getNim());
                intent.putExtra("nama", model.getNama());
                intent.putExtra("tempatLahir", model.getTempatLahir());
                intent.putExtra("tglLahir", model.getTglLahir());
                intent.putExtra("alamat", model.getAlamat());
                intent.putExtra("agama", model.getAgama());
                intent.putExtra("tlp", model.getTlp());
                intent.putExtra("masuk", model.getMasuk());
                intent.putExtra("lulus", model.getLulus());
                intent.putExtra("pekerjaan", model.getPekerjaan());
                intent.putExtra("jabatan", model.getJabatan());

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        getData();
    }

    void getData() {
        adapterDataAlumni.clear();
        ArrayList<AlumniModel> datas = new ArrayList<>();
        SQLiteDatabase database = new DatabaseHelper(this).getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM tb_data_alumni", null);

        if (cursor.moveToFirst()) {
            do {
                AlumniModel model = new AlumniModel();
                model.setId(cursor.getInt(0));
                model.setNim(cursor.getString(1));
                model.setNama(cursor.getString(2));
                model.setTempatLahir(cursor.getString(3));
                model.setTglLahir(cursor.getString(4));
                model.setAlamat(cursor.getString(5));
                model.setAgama(cursor.getString(6));
                model.setTlp(cursor.getString(7));
                model.setMasuk(cursor.getString(8));
                model.setLulus(cursor.getString(9));
                model.setPekerjaan(cursor.getString(10));
                model.setJabatan(cursor.getString(11));
                datas.add(model);
            } while (cursor.moveToNext());
        }
        adapterDataAlumni.addAll(datas);
        adapterDataAlumni.notifyDataSetChanged();
    }
}