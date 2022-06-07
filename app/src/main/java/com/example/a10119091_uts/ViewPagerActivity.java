package com.example.a10119091_uts;

//        nim : 10119091
//        nama : muhammadrojabinurfauzi
//        kelas : IF-3
//        tanggal pengerjaan : 5 Juni 2022

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewPagerActivity extends Activity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Intent pindahIntent = new Intent(ViewPagerActivity.this, ViewPagerActivity2.class);
                startActivity(pindahIntent);
                break;
        }
    }
}
