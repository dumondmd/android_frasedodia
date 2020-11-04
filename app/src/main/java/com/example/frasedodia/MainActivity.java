package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String [] frases = {
                "Oi",
                "Olá",
                "Boa noite",
                "Bom dia",
                "Boa tarde"
        };

        int numero = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }
}
