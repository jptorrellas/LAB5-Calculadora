package com.example.a55.calculadora;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;

/**
 * Created by A55 on 11/04/2017.
 */

public class Vista {

    public Modelo modelo;
    public Activity activity;

    public EditText etNumero1;
    public EditText etNumero2;
    public TextView tvResultado;
    public Button btnSumar;
    public Button btnRestar;
    public Button btnMultiplicar;
    public Button btnDividir;

    public Vista(Modelo modelo, Activity activity) {

        this.modelo = modelo;
        this.activity = activity;

        this.etNumero1       = (EditText) activity.findViewById(R.id.etNumero1);
        this.etNumero2       = (EditText) activity.findViewById(R.id.etNumero2);
        this.tvResultado     = (TextView) activity.findViewById(R.id.tvResultado);
        this.btnSumar        = (Button) activity.findViewById(R.id.btnSumar);
        this.btnRestar       = (Button) activity.findViewById(R.id.btnRestar);
        this.btnMultiplicar  = (Button) activity.findViewById(R.id.btnMultiplicar);
        this.btnDividir      = (Button) activity.findViewById(R.id.btnDividir);

    }
}
