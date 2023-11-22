package com.stackmobile.recuperandooidcomomtodofindviewbyid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //outra forma de criar seria global

    //por exxemplo: private Button btCadastrar;
    // private TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCadastrar = findViewById(R.id.btCadastrar);
        TextView txtMensagem = findViewById(R.id.txtMensagem);

        // btCadastrar.setOnClickListener(v -> Toast.makeText(MainActivity.this, "botao foi clicado!", Toast.LENGTH_SHORT).show());
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMensagem.setText("O usuário foi cadastrado");
            }
        });

    }

}



