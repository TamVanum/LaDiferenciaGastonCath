package com.example.ladiferenciajarronesgastoncathalifaud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ladiferenciajarronesgastoncathalifaud.model.Jar;
import com.example.ladiferenciajarronesgastoncathalifaud.model.Person;

import org.w3c.dom.Text;

public class Jarrones_act extends AppCompatActivity {

    private Spinner userNames;
    private Spinner jarsNames;
    private TextView aditionalText, finalValue;
    private RatingBar ratioJar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarrones);

        userNames = (Spinner) findViewById(R.id.spnUserName);
        jarsNames = (Spinner) findViewById(R.id.spnJarName);
        aditionalText = (TextView) findViewById(R.id.lblAditionalValue);
        finalValue = (TextView) findViewById(R.id.lblFinalPrice);
        ratioJar = (RatingBar) findViewById(R.id.rtbJarRating);

        Person oPerson = new Person();
        Jar oJar = new Jar();

        ArrayAdapter arrayAdapterPerson = new ArrayAdapter(this, android.R.layout.simple_spinner_item, oPerson.getName());
        userNames.setAdapter(arrayAdapterPerson);

        ArrayAdapter arrayAdapterJar = new ArrayAdapter(this, android.R.layout.simple_spinner_item, oJar.getName());
        jarsNames.setAdapter(arrayAdapterJar);


    }

    public void CalculateFinalValue(View view) {

        Person oPerson = new Person();
        int balance;
        Jar oJar = new Jar();
        int ratio = 0;
        int aditional = 0;
        int value = 0;

        String userReference = userNames.getSelectedItem().toString();
        String jarReference = jarsNames.getSelectedItem().toString();

        aditional = oJar.calculateAditional(jarReference);
        ratio = oJar.calculateRatingBar(jarReference);
        value = oJar.calculatePrice(jarReference) + aditional;

        balance = oPerson.calculateBalance(userReference) - value;

        ratioJar.setRating(ratio);
        aditionalText.setText(""+aditional);
        finalValue.setText("el costo final es: "+ value);



    }
}