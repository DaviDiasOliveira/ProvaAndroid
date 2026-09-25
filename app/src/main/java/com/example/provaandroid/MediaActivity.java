package com.example.provaandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MediaActivity extends AppCompatActivity {

    EditText nota1;
    EditText nota2;
    EditText trabalho;
    EditText atividade;

    TextView resultado;

    Button calcular;
    Button voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        nota1 = findViewById(R.id.prova1edit);
        nota2 = findViewById(R.id.prova2edit);
        trabalho = findViewById(R.id.trabalhoedit);
        atividade = findViewById(R.id.atividadeedit);

        resultado = findViewById(R.id.resultadotxt);

        calcular = findViewById(R.id.mediabtn);
        voltar = findViewById(R.id.voltarbtn1);

        calcular.setOnClickListener(v -> {
            double n1 = Double.parseDouble(
                    nota1.getText().toString()
            );
            double n2 = Double.parseDouble(
                    nota2.getText().toString()
            );
            double n3 = Double.parseDouble(
                    trabalho.getText().toString()
            );
            double n4 = Double.parseDouble(
                    atividade.getText().toString()
            );

            double media = (n1 + n2 + n3 + n4) / 4;

            resultado.setText(String.format("%.2f", media));
        });

        voltar.setOnClickListener(v ->
                finish()
        );
    }
}