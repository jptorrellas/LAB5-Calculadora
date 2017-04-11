package com.example.a55.calculadora;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Modelo modelo = new Modelo();
        Vista vista = new Vista(modelo, this);
        Controlador controlador = new Controlador(vista);
        //Toast.makeText(this, "ENTRO APP", Toast.LENGTH_SHORT).show();
        //Log.i("ENTRO", "APP");
        System.out.println("ENTROOOOOOOOOOOOOOOOOOO");
    }
}
