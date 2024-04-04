package com.ellen.martins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmbaralhadorActivity extends AppCompatActivity {

    private EditText editTextFrase;
    private Button buttonEmbaralhar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embaralhador);

        editTextFrase = findViewById(R.id.editTextFrase);
        buttonEmbaralhar = findViewById(R.id.buttonEmbaralhar);
        buttonEmbaralhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                embaralharFrase();
                editTextFrase.setText("");
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbarEmbaralhador);
        setSupportActionBar(toolbar);
    }
    private void embaralharFrase() {
        String fraseOriginal = editTextFrase.getText().toString();
        String fraseEmbaralhada = embaralharString(fraseOriginal);
        editTextFrase.setText(fraseEmbaralhada);
        Toast.makeText(this, "Sua frase embaralhada é: " + fraseEmbaralhada,
                Toast.LENGTH_SHORT).show();
    }

        private String embaralharString(String input) {

        List<Character> caracteres = new ArrayList<>();
        for (char c : input.toCharArray()) {
            caracteres.add(c);
        }

        Collections.shuffle(caracteres);

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : caracteres) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }



    // Faz o ícone da setinha voltar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Verifica se o item do menu foi clicado
        if (item.getItemId() == R.id.menu_abrir_tela) {
            // Navegue para a nova tela
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}