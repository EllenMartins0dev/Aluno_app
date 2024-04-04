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
import java.util.Calendar;

public class IdadeActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextAnoNascimento;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idade);

        editTextAnoNascimento = findViewById(R.id.editTextAnoNascimento);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular.setOnClickListener(this);

        Toolbar toolbar = findViewById(R.id.toolbarIdade);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonCalcular) {
            descobrirIdade();
            editTextAnoNascimento.setText("");
        }

    }

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


    private void descobrirIdade() {
        // Obtém o ano atual do computador
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int anoNascimento = Integer.parseInt(editTextAnoNascimento.getText().toString());
        int idade = anoAtual - anoNascimento;
        Toast.makeText(this, "Sua idade é: " + idade, Toast.LENGTH_LONG).show();
    }

}