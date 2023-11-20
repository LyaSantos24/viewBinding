package com.stackmobile.recuperandooidcomomtodofindviewbyid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCadastrar = findViewById(R.id.btCadastrar);

        btCadastrar.setOnClickListener(v -> Toast.makeText(MainActivity.this, "botao foi cliado!", Toast.LENGTH_SHORT).show());

        }


}
