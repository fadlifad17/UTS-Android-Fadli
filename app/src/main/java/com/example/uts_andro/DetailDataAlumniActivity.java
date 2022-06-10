package com.example.uts_andro;

import android.app.DatePickerDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uts_andro.database.DatabaseHelper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DetailDataAlumniActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtNim, edtNama, edtTempatLahir, edtTglLahir, edtAlamat, edtAgama, edtTlp, edtMasuk, edtLulus, edtPekerjaan, edtJabatan;
    Button actionUbah, actionHapus;
    Calendar calendar = Calendar.getInstance();
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data_alumni);
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
        actionHapus = findViewById(R.id.actionHapus);
        actionUbah = findViewById(R.id.actionUbah);

        edtTglLahir.setOnClickListener(this);
        actionUbah.setOnClickListener(this);
        actionHapus.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            id = extras.getInt("id");
            edtNim.setText(extras.getString("nim", ""));
            edtNama.setText(extras.getString("nama", ""));
            edtTempatLahir.setText(extras.getString("tempatLahir", ""));
            edtTglLahir.setText(extras.getString("tglLahir", ""));
            edtAlamat.setText(extras.getString("alamat", ""));
            edtAgama.setText(extras.getString("agama", ""));
            edtTlp.setText(extras.getString("tlp", ""));
            edtMasuk.setText(extras.getString("masuk", ""));
            edtLulus.setText(extras.getString("lulus", ""));
            edtPekerjaan.setText(extras.getString("pekerjaan", ""));
            edtJabatan.setText(extras.getString("jabatan", ""));
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.actionUbah:
                if (edtNim.getText().toString().length() > 0 && edtNama.getText().toString().length() > 0 && edtTempatLahir.getText().toString().length() > 0 && edtTglLahir.getText().toString().length() > 0 && edtAlamat.getText().toString().length() > 0 && edtAgama.getText().toString().length() > 0 && edtTlp.getText().toString().length() > 0 && edtMasuk.getText().toString().length() > 0 && edtLulus.getText().toString().length() > 0 && edtPekerjaan.getText().toString().length() > 0 && edtJabatan.getText().toString().length() > 0) {
                    update();
                } else {
                    Toast.makeText(this, "Data Belum Lengkap. Mohon Lengkapi Data", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.actionHapus:
                SQLiteDatabase database2 = new DatabaseHelper(this).getWritableDatabase();
                long delete = database2.delete("tb_data_alumni", "id=?", new String[]{"" + id});
                if (delete != -1) {
                    Toast.makeText(this, "Hapus Data Berhasil", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(DetailDataAlumniActivity.this, DataAlumniActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Hapus Data Gagal", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.edtTglLahir:
                new DatePickerDialog(this, onDateSetListener, calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
                break;
        }
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

    void update() {
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

        long update = database.update("tb_data_alumni", contentValues, "id=?", new String[]{"" + id});

        if (update != -1) {
            Toast.makeText(this, "Update Data Berhasil", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Update Data Gagal", Toast.LENGTH_SHORT).show();
        }

        database.close();

    }
}