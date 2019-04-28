package sanchezartega.facci.rencaronline;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashCreen extends AppCompatActivity {
    private final int DURACION_SPLASH = 3000; // 3 segundos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashcreen);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(SplashCreen.this, Login.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
