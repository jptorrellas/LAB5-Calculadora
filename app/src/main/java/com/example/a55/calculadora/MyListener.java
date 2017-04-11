package com.example.a55.calculadora;

import android.view.View;

/**
 * Created by A55 on 11/04/2017.
 */

public class MyListener implements View.OnClickListener {

    private ICalculo iCalculo;

    public MyListener(ICalculo iCalculo) {
        this.iCalculo = iCalculo;
    }

    @Override
    public void onClick(View v) {
        iCalculo.calcular(v);
    }
}
