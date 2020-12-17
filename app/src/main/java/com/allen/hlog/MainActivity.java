package com.allen.hlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.allen.hao.Hao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Hao.init(getApplication(),true);
//        Hao.e("1212121212");
    }
}