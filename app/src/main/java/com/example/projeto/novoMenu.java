package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class novoMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_menu);
    }


    public void ProximaPagina(View view){

        Intent intent = new Intent(novoMenu.this, MenuPrincipal.class);
        startActivity(intent);
    }


    public void logout (View view) {

        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), MeuPerfil.class));
        finish();

    }

}