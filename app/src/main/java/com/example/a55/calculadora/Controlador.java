package com.example.a55.calculadora;

import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by A55 on 11/04/2017.
 */

public class Controlador implements ICalculo {

    public Vista vista;
    public MyListener listener;

    public Controlador(Vista vista) {

        this.listener = new MyListener(this);
        this.vista    = vista;

        this.vista.btnSumar.setOnClickListener(listener);
        this.vista.btnRestar.setOnClickListener(listener);
        this.vista.btnMultiplicar.setOnClickListener(listener);
        this.vista.btnDividir.setOnClickListener(listener);
    }

    @Override
    public void calcular(View v) {

        String n1String = this.vista.etNumero1.getText().toString();
        String n2String = this.vista.etNumero2.getText().toString();

        if(TextUtils.isEmpty(n1String)) {
            this.vista.etNumero1.setError("Ingrese número");
            return;
        }

        if(TextUtils.isEmpty(n2String)) {
            this.vista.etNumero2.setError("Ingrese número");
            return;
        }

        Double n1 = (Double)Double.parseDouble(n1String);
        Double n2 = (Double)Double.parseDouble(n2String);
        Double rdo = 0.0;

        switch (v.getId()) {

            case R.id.btnSumar:
                rdo = this.sumar(n1, n2);
                this.vista.tvResultado.setText(rdo.toString());
                break;

            case R.id.btnRestar:
                rdo = this.restar(n1, n2);
                this.vista.tvResultado.setText(rdo.toString());
                break;

            case R.id.btnMultiplicar:
                rdo = this.multiplicar(n1, n2);
                this.vista.tvResultado.setText(rdo.toString());
                break;

            case R.id.btnDividir:
                if (n2 != 0) {
                    rdo = this.dividir(n1, n2);
                    this.vista.tvResultado.setText(rdo.toString());
                }
                else {
                    Toast toast = Toast.makeText(this.vista.activity, "NO SE PUEDE DIVIDIR ENTRE CERO", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            default:
                System.out.println("DEFAUUULLLTTTTTT");
                break;
        }


    }

    @Override
    public Double sumar(Double n1, Double n2) {
        return n1 + n2;
    }

    @Override
    public Double restar(Double n1, Double n2) {
        return n1 - n2;
    }

    @Override
    public Double multiplicar(Double n1, Double n2) {
        return n1 * n2;
    }

    @Override
    public Double dividir(Double n1, Double n2) {
        return n1 / n2;
    }
}
