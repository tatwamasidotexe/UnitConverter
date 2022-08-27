package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TempCalculator extends AppCompatActivity{

    String[] units = {"Celsius","Fahrenheit","Kelvin"};
    Spinner to , from;
    EditText fval,tval;
    String tv_from,tv_to;
    TextView flabel,tlabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempcalculator_layout);
        to = findViewById(R.id.FromDropdown);
        from = findViewById(R.id.ToDropdown);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.select_dialog_item, units);
        ad.setDropDownViewResource(android.R.layout.select_dialog_item);
        to.setPrompt("Select");
        from.setPrompt("Select");
        to.setAdapter(ad);
        from.setAdapter(ad);

        tv_from  = from.getSelectedItem().toString();
        tv_to = to.getSelectedItem().toString();
        flabel = findViewById(R.id.f_unit);
        tlabel = findViewById(R.id.t_unit);
        flabel.setText(tv_from);
        tlabel.setText(tv_to);

//        to.setOnItemSelectedListener();
    }
}
