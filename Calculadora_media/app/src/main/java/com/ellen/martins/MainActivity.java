package com.ellen.martins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View .OnClickListener{

    private Button buttonMedia;
    private Button buttonEmbaralhador;
    private Button buttonIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMedia = findViewById(R.id.buttonMedia);
        buttonMedia.setOnClickListener(this);
        buttonEmbaralhador = findViewById(R.id.buttonEmbaralhador);
        buttonEmbaralhador.setOnClickListener(this);
        buttonIdade = findViewById(R.id.buttonIdade);
        buttonIdade.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonMedia) {
            abrirTelaMedia();
        }
        if (v.getId() == R.id.buttonEmbaralhador) {
            abrirTelaEmbaralhador();
        }
        if (v.getId() == R.id.buttonIdade) {
            abrirTelaIdade();
        }
    }

    private void abrirTelaMedia() {
        Intent telaMedia = new Intent(this, MediaActivity.class);
        startActivity(telaMedia);
        finish();
    }
    private void abrirTelaEmbaralhador() {
        Intent telaEmbaralhador = new Intent(this, EmbaralhadorActivity.class);
        startActivity(telaEmbaralhador);
        finish();
    }

    private void abrirTelaIdade() {
        Intent telaIdade = new Intent(this, IdadeActivity.class);
        startActivity(telaIdade);
        finish();
    }
}