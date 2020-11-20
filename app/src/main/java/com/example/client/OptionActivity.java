package com.example.client;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import android.os.Bundle;

public class OptionActivity extends AppCompatActivity {

    private Switch swich, swich2, swich3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);



        button = findViewById(R.id.button);
    }
}