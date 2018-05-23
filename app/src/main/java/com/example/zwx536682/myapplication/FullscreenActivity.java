package com.example.zwx536682.myapplication;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

public class FullscreenActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    FullsAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        recyclerView = findViewById(R.id.rlView);

        FragmentManager manager = getSupportFragmentManager();
    }
}
