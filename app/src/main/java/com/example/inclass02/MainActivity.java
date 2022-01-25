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

//    a. Assignment #. InClass2
//    b. InClass02
//    c. Cornell Reddick

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewResults = findViewById(R.id.textViewResult);
        textViewResults.setText("Hello Worlds");

        EditText ticketPrice = findViewById(R.id.ticketPriceTextBox);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        RadioButton radioButton = findViewById(R.id.radio);




        findViewById(R.id.calculateButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!ticketPrice.getText().toString().equals("")) {

                }else {
                    Toast.makeText(getApplicationContext(), "Please enter a number!", Toast.LENGTH_SHORT).show();
                }
            }
            });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {


                if (selectedId == R.id.fivePercentRadio){
                    double value = Double.parseDouble(ticketPrice.getText().toString());
                    double fivePercent = value - (value * .05);
                    textViewResults.setText(String.valueOf(fivePercent));
                }else if(selectedId == R.id.tenPercentRadio){
                    double value = Double.parseDouble(ticketPrice.getText().toString());
                    double tenPercent = value - (value * .10);
                    textViewResults.setText(String.valueOf(tenPercent));
                }else if(selectedId == R.id.fifteenPercentRadio) {
                    double value = Double.parseDouble(ticketPrice.getText().toString());
                    double fifteenPercent = value - (value * .15);
                    textViewResults.setText(String.valueOf(fifteenPercent));
                }else if(selectedId == R.id.fifteenPercentRadio){
                    double value = Double.parseDouble(ticketPrice.getText().toString());
                    double twentyPercent = value - (value * .20);
                    textViewResults.setText(String.valueOf(twentyPercent));
                }else if(selectedId == R.id.twentyPercentRadio){
                    double value = Double.parseDouble(ticketPrice.getText().toString());
                    double fiftyPercent = value - (value * .5);
                    textViewResults.setText(String.valueOf(fiftyPercent));
                }else{
                    //Toast.makeText(, "", Toast.LENGTH_SHORT).show();
                }

            }
        });



        findViewById(R.id.clearResultButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResults.setText("");
                ticketPrice.setText("");

            }
        });

    }


}