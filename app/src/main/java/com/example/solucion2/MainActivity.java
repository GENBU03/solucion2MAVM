package com.example.solucion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nota1, nota2, nota3, nota4;
    TextView promedio;
    Button calcular, nuevo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1 = findViewById(R.id.txtnota1);
        nota2 = findViewById(R.id.txtnota2);
        nota3 = findViewById(R.id.txtnota3);
        nota4 = findViewById(R.id.txtnota4);
        promedio = findViewById(R.id.lblpromedio);
        calcular = findViewById(R.id.btncalcular);
        nuevo = findViewById(R.id.btnnuevo);


        //Boton calcular
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(nota1.getText().toString()).doubleValue();
                double n2 = Double.valueOf(nota2.getText().toString()).doubleValue();
                double n3 = Double.valueOf(nota3.getText().toString()).doubleValue();
                double n4 = Double.valueOf(nota4.getText().toString()).doubleValue();
                calcular objeto = new  calcular(n1, n2, n3, n4);
                promedio.setText(String.format("%.2f", objeto.promedio()));
            }
        });

        //boton nuevo
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nota1.setText("");
                nota2.setText("");
                nota3.setText("");
                nota4.setText("");
                promedio.setText("0");
                nota1.requestFocus();
            }
        });
    }


}