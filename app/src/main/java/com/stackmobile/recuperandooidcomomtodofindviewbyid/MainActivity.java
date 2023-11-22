package com.stackmobile.recuperandooidcomomtodofindviewbyid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.stackmobile.recuperandooidcomomtodofindviewbyid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding; //se criou uma variavel binding que vai herdar da ActivityMain, obs: Binding é biblioteca

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //metodo inflate vai inflar layout, com esse metodo vou passar layout para ActivityMain
        //dai se utiliza metodo getlayoutinflater, onde ele vai recuperar o layout, sabendo exatemente qual é o layout dessa activity
        //Como ele sabe: Ele sabe atraves do método da variavel binding
        setContentView(binding.getRoot());  //.. dai vamos saber todos as referencias que estão nesse layoutbinding

        //Também poderia guardar dentro da variavel, por exemplo: guardar o botao dentro da variavel
        //Button btCadastrar = binding.btCadastrar;
        // dai é so remover o binding embaixo, e ficará btCadastrar.setOn..
        // tambem poderia criar uma variavel para textMensagem

        // que ficaria TextView textMensagem = binding.TxtMensagem;
        // removeria o binding do começo também, deixando ou passando só o txtMensagem.setText()....
        binding.btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.txtMensagem.setText("O usuário foi cadastrado");


            }
        });


    }


}
