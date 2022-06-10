package com.example.uts_andro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uts_andro.database.DatabaseHelper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TambahDataActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtNim, edtNama, edtTempatLahir, edtTglLahir, edtAlamat, edtAgama, edtTlp, edtMasuk, edtLulus,edtPekerjaan, edtJabatan;
    Button actionSimpan;
    Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);
        edtNim = findViewById(R.id.edtNim);
        edtNama = findViewById(R.id.edtNama);
        edtTempatLahir = findViewById(R.id.edtTempatLahir);
        edtTglLahir = findViewById(R.id.edtTglLahir);
        edtAlamat = findViewById(R.id.edtAlamat);
        edtAgama = findViewById(R.id.edtAgama);
        edtTlp = findViewById(R.id.edtTlp);
        edtMasuk = findViewById(R.id.edtMasuk);
        edtLulus = findViewById(R.id.edtLulus);
        edtPekerjaan = findViewById(R.id.edtPekerjaan);
        edtJabatan = findViewById(R.id.edtJabatan);
        actionSimpan = findViewById(R.id.actionSimpan);

        edtTglLahir.setOnClickListener(this);
        actionSimpan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.edtTglLahir:
                new DatePickerDialog(this, onDateSetListener, calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
                break;

            case R.id.actionSimpan:
                if (edtNim.getText().toString().length() > 0 
                        && edtNama.getText().toString().length() > 0 
                        && edtTempatLahir.getText().toString().length() > 0 
                        && edtTglLahir.getText().toString().length() > 0 
                        && edtAlamat.getText().toString().length() > 0 
                        && edtAgama.getText().toString().length() > 0 
                        && edtTlp.getText().toString().length() > 0 
                        && edtMasuk.getText().toString().length() > 0
                        && edtLulus.getText().toString().length() > 0
                        && edtPekerjaan.getText().toString().length() > 0
                        && edtJabatan.getText().toString().length() > 0) {
                    simpan();
                } else {
                    Toast.makeText(this, "Mohon Lengkapi Data", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    void simpan() {
        SQLiteDatabase database = new DatabaseHelper(this).getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("nim", edtNim.getText().toString());
        contentValues.put("nama", edtNama.getText().toString());
        contentValues.put("tempat_lahir", edtTempatLahir.getText().toString());
        contentValues.put("tgl_lahir", edtTglLahir.getText().toString());
        contentValues.put("alamat", edtAlamat.getText().toString());
        contentValues.put("agama", edtAgama.getText().toString());
        contentValues.put("tlp", edtTlp.getText().toString());
        contentValues.put("thn_masuk", edtMasuk.getText().toString());
        contentValues.put("thn_lulus", edtLulus.getText().toString());
        contentValues.put("pekerjaan", edtPekerjaan.getText().toString());
        contentValues.put("jabatan", edtJabatan.getText().toString());

        long insert = database.insert("tb_data_alumni", null, contentValues);

        if (insert !=-1) {
            Toast.makeText(this, "Tambah Data Alumni Berhasil", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Tambah Data Alumni Gagal", Toast.LENGTH_SHORT).show();
        }

        database.close();
    }

    DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, i);
            calendar.set(Calendar.MONTH, i1);
            calendar.set(Calendar.DAY_OF_MONTH, i2);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
            edtTglLahir.setText(simpleDateFormat.format(calendar.getTime()));
        }
    };
}