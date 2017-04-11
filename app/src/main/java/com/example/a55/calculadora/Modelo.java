package com.example.a55.calculadora;

import android.widget.Button;

/**
 * Created by A55 on 11/04/2017.
 */

public class Modelo {

    private Number etNumero1;
    private Number etNumero2;
    private Double tvResultado;

    public Modelo() {
        this.etNumero1 = 0;
        this.etNumero2 = 0;
        this.tvResultado = 0.0;
    }

    public Number getEtNumero1() {
        return etNumero1;
    }

    public Number getEtNumero2() {
        return etNumero2;
    }

    public Double getTvResultado() {
        return tvResultado;
    }
}
