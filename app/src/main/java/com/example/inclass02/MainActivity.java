package com.example.inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double results = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Ticket Price");

        TextView textViewResults = findViewById(R.id.textViewResult);
        EditText ticketPrice = findViewById(R.id.ticketPriceTextBox);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton radioButton = findViewById(R.id.radio);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {
                if(!ticketPrice.getText().toString().equals("")) {

                    if (selectedId == R.id.fivePercentRadio) {
                        double value = Double.parseDouble(ticketPrice.getText().toString());
                        results = value - (value * .05);
                       // textViewResults.setText(String.valueOf(results));
                    } else if (selectedId == R.id.tenPercentRadio) {
                        double value = Double.parseDouble(ticketPrice.getText().toString());
                        results = value - (value * .10);
                       // textViewResults.setText(String.valueOf(results));
                    } else if (selectedId == R.id.fifteenPercentRadio) {
                        double value = Double.parseDouble(ticketPrice.getText().toString());
                        results = value - (value * .15);
                       // textViewResults.setText(String.valueOf(results));
                    } else if (selectedId == R.id.fifteenPercentRadio) {
                        double value = Double.parseDouble(ticketPrice.getText().toString());
                        results = value - (value * .20);
                        //textViewResults.setText(String.valueOf(results));
                    } else if (selectedId == R.id.twentyPercentRadio) {
                        double value = Double.parseDouble(ticketPrice.getText().toString());
                        results = value - (value * .5);

                    } else {
                        //Toast.makeText(, "", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Please enter a number!", Toast.LENGTH_SHORT).show();

                }

            }
        });


        findViewById(R.id.calculateButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!ticketPrice.getText().toString().equals("")) {

                    textViewResults.setText(String.valueOf(results));
                }else {
                    Toast.makeText(getApplicationContext(), "Please enter a number!", Toast.LENGTH_SHORT).show();
                }
            }
        });



        findViewById(R.id.clearResultButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResults.setText("");
                ticketPrice.setText("");
                radioGroup.clearCheck();

            }
        });

    }


}