package com.example.wydenacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar);


        cadastro();


    }

    public void cadastro(){
        Button cadastrar = (Button) findViewById(R.id.btn_cadastro);
        Button cancelar  = (Button) findViewById(R.id.btn_cancelar);

cadastrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        EditText nome,usuario,email,senha;

        nome = (EditText) findViewById(R.id.nome);
        nome.toString();
        usuario = (EditText) findViewById(R.id.entrar_usuario);
        usuario.toString();
        email = (EditText) findViewById(R.id.email);
        email.toString();
        senha = (EditText) findViewById(R.id.entrar_senha);
        senha.toString();


    }
});

cancelar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(cadastrar.this, MainActivity.class);
        startActivity(intent);
    }
});


    }



}
