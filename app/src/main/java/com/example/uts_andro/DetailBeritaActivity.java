package com.example.uts_andro;

import static com.example.uts_andro.R.id;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetailBeritaActivity extends AppCompatActivity {

    ImageView imgNews;
    TextView txtTitle, txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);
        imgNews = findViewById(R.id.imgNews);
        txtTitle = findViewById(id.txtTitle);
        txtContent = findViewById(id.txtContent);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            Picasso.get().load(extras.getString("foto", "")).into(imgNews);
            txtTitle.setText(extras.getString("title", ""));
            txtContent.setText(extras.getString("content", ""));
        }

    }
}