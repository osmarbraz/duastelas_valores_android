package com.exemplo.duastelas_valores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonVoltar;
    private EditText editTextValorRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Associa os componentes da interface aos componentes da classe
        buttonVoltar = findViewById(R.id.buttonVoltar);
        editTextValorRecebido = findViewById(R.id.editTextValorRecebido);

        //Recupera o intent
        Bundle extras = getIntent().getExtras();
        if (extras != null  && getIntent().hasExtra("valor")) {
            //Recupera o valor
            String valor = extras.getString("valor");
            //Coloca o valor na caixa de texto.
            editTextValorRecebido.setText(valor);
        } else {
            editTextValorRecebido.setText("Nenhum valor");
        }
    }

    public void onClickBotaoVoltar(View v) {
        //Fecha a activity e volta a anterior
        finish();
    }
}