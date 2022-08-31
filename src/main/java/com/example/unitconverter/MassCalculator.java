package com.example.unitconverter;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MassCalculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] units = {"Tonne","Kilogram","Gram","Milligram"};
    Spinner to , from;
    EditText f_ed,t_ed;
    String tv_from,tv_to;
    //TextView flabel,tlabel;
    TextView head;
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

        head = findViewById(R.id.Heading);
        head.setText("Mass");

        f_ed = findViewById(R.id.FromVal);
        t_ed = findViewById(R.id.ToVal);

        to.setOnItemSelectedListener(this);
        from.setOnItemSelectedListener(this);

        calc = findViewById(R.id.convert);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(f_ed.getText().toString())){
                    Toast.makeText(MassCalculator.this,"Please Enter Value",Toast.LENGTH_SHORT).show();}//copy till here for all
                else{
                    fval = Double.parseDouble(f_ed.getText().toString());
                    if (tv_from.equals(tv_to)){
                        tval = fval;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Mass.TonToKg(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Mass.TonToGram(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Mass.TonToMg(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Mass.KgToTon(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Mass.KgToGram(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Mass.KgToMg(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Mass.GramToTon(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Mass.GramToKg(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Mass.GramToMg(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[3])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Mass.MgToTon(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[3])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Mass.MgToKg(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[3])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Mass.MgToGram(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                }
            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        tv_from  = from.getSelectedItem().toString();
        tv_to = to.getSelectedItem().toString();
        t_ed.setText("");
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        tv_from  = from.getSelectedItem().toString();
        tv_to = to.getSelectedItem().toString();

    }
}
