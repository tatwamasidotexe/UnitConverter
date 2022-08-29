package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TempCalculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] units = {"Celsius","Fahrenheit","Kelvin"};
    Spinner to , from;
    EditText fval,tval;
    String tv_from,tv_to;
//    TextView flabel,tlabel;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempcalculator_layout);
        from = findViewById(R.id.FromDropdown);
        to = findViewById(R.id.ToDropdown);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.select_dialog_item, units);
        ad.setDropDownViewResource(android.R.layout.select_dialog_item);
        to.setPrompt("Select");
        from.setPrompt("Select");
        to.setAdapter(ad);
        from.setAdapter(ad);

//        flabel = findViewById(R.id.f_unit);
//        tlabel = findViewById(R.id.t_unit);


        to.setOnItemSelectedListener(this);
        from.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        tv_from  = from.getSelectedItem().toString();
        tv_to = to.getSelectedItem().toString();
//        flabel.setText(tv_from);
//        tlabel.setText(tv_to);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        tv_from  = from.getSelectedItem().toString();
        tv_to = to.getSelectedItem().toString();
    }

}
