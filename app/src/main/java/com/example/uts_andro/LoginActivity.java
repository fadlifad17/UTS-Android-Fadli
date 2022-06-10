package com.example.uts_andro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        SharedPreferences preferences = getSharedPreferences("UTS_Andro", MODE_PRIVATE);

        EditText edtEmail = findViewById(R.id.edtEmail);
        EditText edtPassword = findViewById(R.id.edtPassword);
        Button actionLogin = findViewById(R.id.actionLogin);

        actionLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtEmail.getText().toString().length() > 0 && edtPassword.getText().toString().length()>0) {
                    //cek login
                    if(edtEmail.getText().toString().equals("fadlif@gmail.com") && edtPassword.getText().toString().equals("1234")) {
                        //sukses login

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);

                        SharedPreferences.Editor edit = preferences.edit();
                        edit.putString("email", "fadlifad172@gmail.com");
                        edit.putString("nim", "1907411048");
                        edit.putString("nama", "Fadli F");
                        edit.putString("kelas", "TI-6B");
                        edit.putBoolean("isLogin", true);
                        edit.commit();
                        finish();
                    }else {
                        Toast.makeText(LoginActivity.this, "Mohon Maaf Email dan Password Salah", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(LoginActivity.this, "Mohon Lengkapi Data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}