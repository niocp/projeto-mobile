package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Catalogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
    }

    public void Produto1Page(View view){
        Intent tela = new Intent(this, Produto.class);
        startActivity(tela);
    }

    public void Produto2Page(View view){
        Intent tela = new Intent(this, Produto2.class);
        startActivity(tela);
    }

    public void Produto3Page(View view){
        Intent tela = new Intent(this, Produto3.class);
        startActivity(tela);
    }

    public void Produto4Page(View view){
        Intent tela = new Intent(this, Produto4.class);
        startActivity(tela);
    }

    public void VoltarAoMenu(View view){
        Intent tela = new Intent(this,MenuPrincipal.class);
        startActivity(tela);

    }

}