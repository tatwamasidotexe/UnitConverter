package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class TempCalculator extends AppCompatActivity{

    String[] units = {"Celsius","Fahrenheit","Kelvin"};
    Spinner to , from;
    EditText fval,tval;
    int t_ind=1,f_ind=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempcalculator_layout);
        to = findViewById(R.id.FromDropdown);
        from = findViewById(R.id.ToDropdown);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_spinner_item, units);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        to.setAdapter(ad);
        from.setAdapter(ad);
    }
}
