package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup groupProfessores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupProfessores = (RadioGroup)  findViewById(R.id.idGroup);
    }


    public void floatButtonClick(View view) {
        RadioButton radioSelecionado = (RadioButton)  findViewById(groupProfessores.getCheckedRadioButtonId());
        if (radioSelecionado.getText().toString().equals("Rafael Moreno"))
            Toast.makeText(this, "Resposta Correta!", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Resposta Errada, quem leciona essa matéria é o Rafael Moreno", Toast.LENGTH_SHORT).show();
    }

}