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
    Button btns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.txtNombre);
        d1 = findViewById(R.id.txtFecha);
        e2 = findViewById(R.id.txtNumero);
        e3 = findViewById(R.id.txtCorreo);
        e4 = findViewById(R.id.txtDescripcion);

        btns = findViewById(R.id.boton1);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next = new Intent(getApplicationContext(), dos.class);
                String nombre = e1.getText().toString();
                int duration= Toast.LENGTH_SHORT;
                Toast.makeText(MainActivity.this,nombre,duration).show();
                next.putExtra("NOMBRES", nombre);

                int día = d1.getDayOfMonth();
                int mes = d1.getMonth();
                int año = d1.getYear();
                String día1 =""+día;
                String mes1 =""+mes;
                String año1 =""+año;
                next.putExtra("día",día1);
                next.putExtra("mes",mes1);
                next.putExtra("año",año1);

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
