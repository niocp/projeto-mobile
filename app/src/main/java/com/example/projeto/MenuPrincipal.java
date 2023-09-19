package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void PaginaAnterior(View view){
        Intent tela = new Intent(this,MainActivity.class);
        startActivity(tela);

    }

    public void PaginaDoCatalogo(View view){
        Intent tela = new Intent(this, MainActivity.class);
        startActivity(tela);
    }

    public void PaginaDeLogin(View view){
        Intent tela = new Intent(this, MeuPerfil.class);
        startActivity(tela);
    }

    public void PaginaCadastro(View view){
        Intent tela = new Intent(this, TelaDeCadastro.class);
        startActivity(tela);
    }

}
