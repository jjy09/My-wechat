package com.example.mywork;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArraySet;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("", "oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("生命周期", "onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("生命周期", "onpause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("生命周期", "onresume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("生命周期", "onrestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("生命周期", "onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("生命周期", "ondestroy");
    }

}