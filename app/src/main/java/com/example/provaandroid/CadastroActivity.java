package com.example.provaandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    EditText nomeedit;
    EditText raedit;
    EditText emailedit;

    Button salvar;
    Button voltar;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomeedit = findViewById(R.id.nomeedit);
        raedit = findViewById(R.id.raedit);
        emailedit = findViewById(R.id.emailedit);

        salvar = findViewById(R.id.salvarbtn);
        voltar = findViewById(R.id.voltarbtn2);

        preferences = getSharedPreferences("AlunoPrefs", MODE_PRIVATE);

        salvar.setOnClickListener(v -> {
            String nome = nomeedit.getText().toString();
            String ra = raedit.getText().toString();
            String email = emailedit.getText().toString();

            SharedPreferences.Editor editor = preferences.edit();

            editor.putString("nome", nome);
            editor.putString("ra", ra);
            editor.putString("email", email);

            editor.apply();

            Toast.makeText(
                    this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show();
        });

        voltar.setOnClickListener(v1 ->
                finish()
        );
    }
}