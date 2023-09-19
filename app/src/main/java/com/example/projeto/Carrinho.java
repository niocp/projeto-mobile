package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Carrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
    }

    public void VoltarAoMenu(View view){
        Intent tela = new Intent(this,MenuPrincipal.class);
        startActivity(tela);

    }

    public void IrParaOsDetalhes(View view){
        Intent tela = new Intent(this, EfetuarCompra.class);
        startActivity(tela);

    }

}