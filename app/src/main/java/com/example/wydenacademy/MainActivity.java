package com.example.wydenacademy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText usuario,senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrar();
        cadastre();
    }



    public void entrar(){

        Button btn_entrar = (Button) findViewById(R.id.btn_entrar); // ""
        usuario = (EditText)findViewById(R.id.entrar_usuario); // ""
        senha = (EditText)findViewById(R.id.entrar_senha); //CHAMA OBJETO SENHA ASSOCIADO AO ID

        btn_entrar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = senha.getText().toString(); // PEGA VARIAVEL SENHA E TRANFORMA EM TEXTO
                String u = usuario.toString(); //PEGA VARIAVEL USUARIO E TRANSFORMA EM TEXTO

            //CONDICIONAL PARA VERIFICAR USUARIO E SENHA
           if(u.equals("Luan") || s.equals("123")) {
            Intent intent = new Intent(MainActivity.this, option.class); //CHAMA OUTRA TELA
            startActivity(intent); //FAZ APARECER OUTRA TELA

     }else{
            Toast.makeText(MainActivity.this,"Usuario ou senha incorreto" , Toast.LENGTH_LONG).show(); //MOSTRA MENSAGEM NA TELA
}
            }
        });

    }
    public  void cadastre(){

        TextView cadastre;
        cadastre = (TextView)findViewById(R.id.cad);
        cadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cadastrar.class);
                startActivity(intent);
            }
        });
    }

}
