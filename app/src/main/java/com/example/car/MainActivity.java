package com.example.car;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttoninvia;
    TextView textView;
    EditText editTextmodello;
    EditText editTextcavalli;
    EditText editTextbrand;
    String modello;
    String brand;
    String cavalli;
    String tot="";
    TextView textViewConta;
    int conta=0;
    String conta1="CONTA MACHHINE: ";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        textViewConta = findViewById(R.id.textView2);
        editTextbrand = findViewById(R.id.editTextTextMultiLine3);
        editTextcavalli = findViewById(R.id.editTextTextMultiLine2);
        editTextmodello = findViewById(R.id.editTextTextMultiLine4);
        buttoninvia = findViewById(R.id.button);


        buttoninvia.setOnClickListener(click -> {
            modello = String.valueOf(editTextmodello.getText());
            cavalli = String.valueOf(editTextcavalli.getText());
            brand = String.valueOf(editTextbrand.getText());
            Car c1 = new Car(cavalli, brand, modello);
            tot= tot + "\n\n" + c1.toString();
            conta++;
            conta1 = String.valueOf(conta);
            textViewConta.setText(conta1);
            textView.setText(tot);
        });


    }
}