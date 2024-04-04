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

public class MediaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextNota1;
    private EditText editTextNota2;
    private Button buttonLimpar;
    private Button buttonCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        editTextNota1 = findViewById(R.id.editTextNota1);
        editTextNota2 = findViewById(R.id.editTextNota2);
        buttonLimpar = findViewById(R.id.buttonLimpar);
        buttonLimpar.setOnClickListener(this);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular.setOnClickListener(this);

        Toolbar toolbar = findViewById(R.id.toolbarMedia);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonLimpar) {
            editTextNota1.setText("");
            editTextNota2.setText("");
        }
        if (v.getId() == R.id.buttonCalcular) {
            calcularMedia();
            editTextNota1.setText("");
            editTextNota2.setText("");


        }
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


    private void calcularMedia() {
        double nota1 = Double.parseDouble(editTextNota1.getText().toString());
        double nota2 = Double.parseDouble(editTextNota2.getText().toString());
        double media = (nota1 + nota2)/2;
        Toast.makeText(this, "Sua média é " + media, Toast.LENGTH_LONG).show();
    }
}