package com.example.uts_andro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.uts_andro.NavFragment.berita.NewsFragment;
import com.example.uts_andro.NavFragment.home.HomeFragment;
import com.example.uts_andro.NavFragment.profile.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavbar;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = getSharedPreferences("UTS_Andro", MODE_PRIVATE);
        bottomNavbar = findViewById(R.id.bottom_navbar);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

        bottomNavbar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedItemFrag = null;
                switch (item.getItemId()){
                    case R.id.nav_home:
                        selectedItemFrag = new HomeFragment();
                        break;
                    case R.id.nav_news:
                        selectedItemFrag = new NewsFragment();
                        break;
                    case R.id.nav_profile:
                        selectedItemFrag = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedItemFrag).commit();
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.tamabahData:
                Intent intent1 = new Intent(MainActivity.this, TambahDataActivity.class);
                startActivity(intent1);
                break;

            case R.id.dataPenduduk:
                Intent intent2 = new Intent(MainActivity.this, DataAlumniActivity.class);
                startActivity(intent2);
                break;

            case R.id.logOut:
                SharedPreferences sharedPreferences = getSharedPreferences("UTS_Andro", MODE_PRIVATE);
                SharedPreferences.Editor edit= sharedPreferences.edit();
                edit.clear();
                edit.commit();

                Intent intent3 = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent3);
                finish();

                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}