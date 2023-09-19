package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EfetuarCompra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efetuar_compra);
    }

    public void VoltarAoCarrinho(View view){
        Intent tela = new Intent(this, Carrinho.class);
        startActivity(tela);

    }

}