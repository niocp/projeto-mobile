package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Produto4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto4);
    }

    public void VoltarAoCatalogo(View view){
        Intent tela = new Intent(this,Catalogo.class);
        startActivity(tela);

    }

}