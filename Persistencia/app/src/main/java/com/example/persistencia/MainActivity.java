package com.example.persistencia;

import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonSqlite = findViewById(R.id.Sqlited);
        Button buttonSharedPreference = findViewById(R.id.buttonSharedPreference);
        Button buttonMemoriaInterna = findViewById(R.id.buttonMemoria);
        Button buttonLectura = findViewById(R.id.lecturaFitxer);
        Button buttonMemoriaExterna = findViewById(R.id.buttonMemoriaExterna);


        buttonSharedPreference.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        buttonMemoriaInterna.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent1);
        });

        buttonLectura.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainActivity.this, FourthActivity.class);
            startActivity(intent2);
        });

        buttonMemoriaExterna.setOnClickListener(v -> {
            Intent intent3 = new Intent(MainActivity.this, FifthActivity.class);
            startActivity(intent3);
        });

        buttonSqlite.setOnClickListener(v -> {
            Intent intent4 = new Intent(MainActivity.this, SixActivity.class);
            startActivity(intent4);
        });
    }
}