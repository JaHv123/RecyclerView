package com.example.bonetapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewcantante;
    private RecyclerViewAdapter adaptadorCantante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewcantante = findViewById(R.id.recyclerViewCantante);
        recyclerViewcantante.setLayoutManager(new LinearLayoutManager(this));

        adaptadorCantante = new RecyclerViewAdapter(obtenerCantantes());
        recyclerViewcantante.setAdapter(adaptadorCantante);


    }

    public List<CantanteAdaptador> obtenerCantantes(){
        List<CantanteAdaptador> cantante = new ArrayList<>();
        cantante.add(new CantanteAdaptador("Selena Gomez", "Estados Unidos", R.drawable.selenagomez));
        cantante.add(new CantanteAdaptador("Becky G", "Mexicana", R.drawable.beckyg));
        cantante.add(new CantanteAdaptador("Karol G", "Colombiana", R.drawable.karolg));
        cantante.add(new CantanteAdaptador("Shakira", "Colombiana", R.drawable.shakira));

        return cantante;
    }
}
