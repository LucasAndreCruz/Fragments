package com.cursoandroid.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cursoandroid.fragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remover sombra da ActionBar

        getSupportActionBar().setElevation(5);

    }
}
