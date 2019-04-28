package sanchezartega.facci.rencaronline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import sanchezartega.facci.rencaronline.R;
import sanchezartega.facci.rencaronline.Registro;

public class Login extends AppCompatActivity {
    Button registro,Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registro = (Button) findViewById(R.id.btnregistro);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // se genera la navegabilidad entre la actividad principal y la actividad de login
                Intent intent = new Intent(Login.this,Registro.class);
                startActivity(intent);
            }
        });
        Login = (Button) findViewById(R.id.btnLongi);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // se genera la navegabilidad entre la actividad principal y la actividad de login
                Intent intent = new Intent(Login.this,NavegationDrawer.class);
                startActivity(intent);
            }
        });

    }}