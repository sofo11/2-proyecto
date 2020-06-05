package com.example.semana2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class dos extends AppCompatActivity {
    Button reg;
    Intent ina;
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        t1 = findViewById(R.id.txtNombre);
        t2 = findViewById(R.id.txtFecha);
        t3 = findViewById(R.id.txtNúm);
        t4 = findViewById(R.id.txtCorreo);
        t5 = findViewById(R.id.txtDescripcion);

        Bundle parametros = this.getIntent().getExtras();
        if(parametros !=null){
            String nombre = parametros.getString("NOMBRES");
            t1.setText(nombre);
            String dia = parametros.getString("dia");
            String mes = parametros.getString("mes");
            String ano = parametros.getString("ano");
            t2.setText(""+dia+"/"+mes+"/"+ano);
            String tel = parametros.getString("tele");
            t3.setText(tel);
            String correo = parametros.getString("correo");
            t4.setText(correo);
            String desc = parametros.getString("descri");
            t5.setText(desc);

        }
        reg = findViewById(R.id.boton2);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ina = new Intent(dos.this, MainActivity.class);
                startActivity(ina);
            }


        });

            }



    }


