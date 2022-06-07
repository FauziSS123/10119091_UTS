package com.example.a10119091_uts;

//        nim : 10119091
//        nama : muhammadrojabinurfauzi
//        kelas : IF-3
//        tanggal pengerjaan : 3 Juni 2022

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNavigationView = findViewById((R.id.bottomNavigationView));
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.fragment1, R.id.fragment2, R.id.fragment3).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}