package com.example.evaluacin_prctica_iii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pantalla1 extends AppCompatActivity {

    private Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        btn_guardar = (Button) findViewById(R.id.entrar);
    }

    public void guardar(View view) {
        Toast.makeText(Pantalla1.this, "Has hecho Clic en Guardar", Toast.LENGTH_SHORT).show();
    }
}