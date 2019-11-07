package com.example.bonetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvCsntante, tvnacionalidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvCsntante = findViewById(R.id.txtNombreCantante);
        tvnacionalidad = findViewById(R.id.txtNacionalidadCantante);

        Intent intent = getIntent();
        String cantante = intent.getExtras().getString("cantante");
        String nacionalidad = intent.getExtras().getString("nacionalidad");

        tvCsntante.setText(cantante);
        tvnacionalidad.setText(nacionalidad);

    }
}
