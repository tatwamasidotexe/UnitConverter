package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TempCalculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] units = {"Celsius","Fahrenheit","Kelvin"};
    Spinner to , from;
    EditText f_ed,t_ed;
    String tv_from,tv_to;
    //TextView flabel,tlabel;
    CardView calc;
    double fval,tval;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_ui);
        from = findViewById(R.id.FromDropdown);
        to = findViewById(R.id.ToDropdown);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, units);
        ad.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        to.setPrompt("Select");
        from.setPrompt("Select");
        to.setAdapter(ad);
        from.setAdapter(ad);

        //flabel = findViewById(R.id.f_unit);
        //tlabel = findViewById(R.id.t_unit);

        f_ed = findViewById(R.id.FromVal);
        t_ed = findViewById(R.id.ToVal);

        to.setOnItemSelectedListener(this);
        from.setOnItemSelectedListener(this);

        calc = findViewById(R.id.convert);

//        Thread calculate = new Thread(){
//
//        }


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(f_ed.getText().toString())){
                    Toast.makeText(TempCalculator.this,"Please Enter Value",Toast.LENGTH_SHORT).show();}//copy till here for all
                else{
                    fval = Double.parseDouble(f_ed.getText().toString());
                    if (tv_from.equals(tv_to)){
                        tval = fval;

                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Temp.CelToFar(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Temp.CelToKelvin(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Temp.FarToCel(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Temp.FarToKelvin(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Temp.KelvinToCel(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Temp.KelvinToFar(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                }
            }

        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        tv_from  = from.getSelectedItem().toString();
        tv_to = to.getSelectedItem().toString();
        //flabel.setText(tv_from);
        //tlabel.setText(tv_to);
        t_ed.setText("");

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        tv_from  = from.getSelectedItem().toString();
        tv_to = to.getSelectedItem().toString();
    }



}
