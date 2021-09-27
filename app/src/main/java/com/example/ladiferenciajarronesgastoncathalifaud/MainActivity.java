package com.example.ladiferenciajarronesgastoncathalifaud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private TextView advice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.txtUser);
        pass = (EditText) findViewById(R.id.pswPassword);
        advice = (TextView) findViewById(R.id.lblAdvice);

    }

    public void ChargeCalc(View view){
        Intent i = new Intent(this, CalcularJarrones_act.class);
        startActivity(i);
    }

    public void ChargeLogin(View view){

        String username = String.valueOf(user.getText());
        String password = String.valueOf(pass.getText());
        if (username.equalsIgnoreCase("Gaston") && password.equals("123")){
            Intent i = new Intent(this, Jarrones_act.class);
            startActivity(i);
        } else {
            advice.setText("Usuario no encontrado en base de datos");
        }

    }
}