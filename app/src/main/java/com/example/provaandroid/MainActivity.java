package com.example.provaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = findViewById(R.id.calcularbtn);
        cadastrar = findViewById(R.id.cadastrarbtn);

        calcular.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MediaActivity.class);
                startActivity(intent);
        });

        cadastrar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
        });

    }
}