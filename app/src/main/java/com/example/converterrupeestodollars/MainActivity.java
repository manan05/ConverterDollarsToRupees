package com.example.converterrupeestodollars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etAmount;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmount = findViewById(R.id.etAmount);
        btnConvert = findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                if (!etAmount.getText().toString().equals("")) {
                    String valInDollars = etAmount.getText().toString();
                    Float valInDollarsDouble = Float.parseFloat(valInDollars);
                    Float valInRupeesDouble = (float) (valInDollarsDouble * 69.30);
                    String valInRupees = String.valueOf(valInRupeesDouble);
                    Toast.makeText(MainActivity.this,
                            valInDollars + "$ is " + "₹" + valInRupees,
                            Toast.LENGTH_LONG).show();
                    etAmount.setText(null);
                }

            }});
=======
                String valInDollars = etAmount.getText().toString();
                Float valInDollarsDouble = Float.parseFloat(valInDollars);
                Float valInRupeesDouble = (float)(valInDollarsDouble * 69.30);
                String valInRupees = String.valueOf(valInRupeesDouble);
                Toast.makeText(MainActivity.this,valInDollars + "$ is " + "₹" +valInRupees,Toast.LENGTH_LONG).show();
                // This will make a popup on the screen with the converted value
                etAmount.setText(null); // this will make the text in EditText empty for the next value
            }

        });
>>>>>>> 89d3120d4d388cf32297cbf1fb64679786d85938

    }

}
