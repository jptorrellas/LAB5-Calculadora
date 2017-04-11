package com.example.a55.calculadora;

import android.view.View;

/**
 * Created by A55 on 11/04/2017.
 */

public interface ICalculo {

    public void calcular(View v);
    public Double sumar(Double n1, Double n2);
    public Double restar(Double n1, Double n2);
    public Double multiplicar(Double n1, Double n2);
    public Double dividir(Double n1, Double n2);
}
