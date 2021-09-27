package com.example.ladiferenciajarronesgastoncathalifaud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ladiferenciajarronesgastoncathalifaud.model.Jar;

public class CalcularJarrones_act extends AppCompatActivity {

    private Spinner jars;
    private CheckBox twelve, twentyfour;
    private TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_jarrones);
        jars = (Spinner) findViewById(R.id.spnJars);
        twelve = (CheckBox) findViewById(R.id.chkTwelveJars);
        twentyfour = (CheckBox) findViewById(R.id.chkTwentyJars);
        message = (TextView) findViewById(R.id.lblMessage);

        Jar oJar = new Jar();
        ArrayAdapter arrayAdapterJar = new ArrayAdapter(this, android.R.layout.simple_spinner_item, oJar.getName());
        jars.setAdapter(arrayAdapterJar);

    }

    public void CalculateValue(View view) {
        Jar oJar = new Jar();

        int result = 0;
        if (twelve.isChecked() && twentyfour.isChecked() || !twelve.isChecked() && !twentyfour.isChecked()){
            message.setText("Operacion invalida");
        }
        else {
            String reference = jars.getSelectedItem().toString();
            if (twelve.isChecked()){
                result = 12 * oJar.calculatePrice(reference);
                message.setText("Compraste 12 jarrones de " +reference+" su costo es: "+ result);
            }
            if (twentyfour.isChecked()){
                result = 24 * oJar.calculatePrice(reference);
                message.setText("Compraste 24 jarrones de " +reference+" su costo es: "+ result);
            }

        }
    }
}