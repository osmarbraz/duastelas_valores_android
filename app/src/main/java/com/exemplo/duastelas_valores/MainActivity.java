package com.exemplo.duastelas_valores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Componentes a serem manipulados
    private Button buttonTela2;
    private Button buttonFechar;
    private EditText editTextValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa os componentes da interface aos componentes da classe
        buttonTela2 = findViewById(R.id.buttonTela2);
        buttonFechar = findViewById(R.id.buttonFechar);
        editTextValor = findViewById(R.id.editTextValor);
    }

    public void onClickBotaoTela2(View v) {
        //Recupera o intennt para a tela2
        Intent intent = new Intent(this, MainActivity2.class);
        //Armazena o valor no intent
        intent.putExtra("valor", editTextValor.getText().toString());
        //Abre a segunda tela
        startActivity(intent);
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);

    }
}