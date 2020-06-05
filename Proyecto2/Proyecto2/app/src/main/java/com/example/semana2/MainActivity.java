package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    DatePicker d1;
    Button unos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.txtNombreComp);
        d1 = findViewById(R.id.datePicker1);
        e2 = findViewById(R.id.txtTelefono);
        e3 = findViewById(R.id.txtCorre0);
        e4 = findViewById(R.id.txtDescripcion);

        unos = findViewById(R.id.btn1);
        unos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next = new Intent(MainActivity.this, dos.class);
                String nombre = e1.getText().toString();
                int duration= Toast.LENGTH_SHORT;
                Toast.makeText(MainActivity.this,nombre,duration).show();
                next.putExtra("NOMBRES", nombre);

                int dia = d1.getDayOfMonth();
                int mes = d1.getMonth();
                int ano = d1.getYear();
                String dia1 =""+dia;
                String mes1 =""+mes;
                String ano1 =""+ano;
                next.putExtra("dia",dia1);
                next.putExtra("mes",mes1);
                next.putExtra("ano",ano1);

                String tel = e2.getText().toString();
                next.putExtra("telef",tel);

                String correo = e3.getText().toString();
                next.putExtra("corr",correo);

                String desc = e4.getText().toString();
                next.putExtra("desc",desc);


                startActivity(next);
            }
        });

    }


}
