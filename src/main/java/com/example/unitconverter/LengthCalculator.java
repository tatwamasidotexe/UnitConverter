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

public class LengthCalculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] units = {"Millimeter","Meter","Centimeter","Kilometer","Inch","Mile"};
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
        head.setText("Length");

        f_ed = findViewById(R.id.FromVal);
        t_ed = findViewById(R.id.ToVal);

        to.setOnItemSelectedListener(this);
        from.setOnItemSelectedListener(this);

        calc = findViewById(R.id.convert);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(f_ed.getText().toString())){
                    Toast.makeText(LengthCalculator.this,"Please Enter Value",Toast.LENGTH_SHORT).show();}
                else{
                    fval = Double.parseDouble(f_ed.getText().toString());
                    if (tv_from.equals(tv_to)){
                        tval = fval;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Length.MilliToMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Length.MilliToCMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Length.MilliToKMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[4])){
                        tval = UnitsConverter.Length.MilliToinch(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[0])&&tv_to.equals(units[5])){
                        tval = UnitsConverter.Length.MilliTomile(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Length.MeterToMilli(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Length.MeterToCenti(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Length.MeterToKMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[4])){
                        tval = UnitsConverter.Length.MeterToInch(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[1])&&tv_to.equals(units[5])){
                        tval = UnitsConverter.Length.MeterToMile(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }

                    else if(tv_from.equals(units[2])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Length.CentiToMilli(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Length.CentiToMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Length.CentiToKMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[4])){
                        tval = UnitsConverter.Length.CentiToinch(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[2])&&tv_to.equals(units[5])){
                        tval = UnitsConverter.Length.CentiToMile(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }


                    else if(tv_from.equals(units[3])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Length.KiloToMilli(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[3])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Length.KiloToMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[3])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Length.KiloToCenti(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[3])&&tv_to.equals(units[4])){
                        tval = UnitsConverter.Length.KiloToinch(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[3])&&tv_to.equals(units[5])){
                        tval = UnitsConverter.Length.KiloToMile(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }

                    else if(tv_from.equals(units[4])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Length.InchToMilli(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[4])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Length.InchToMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[4])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Length.InchToCenti(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[4])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Length.InchToKilo(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[4])&&tv_to.equals(units[5])){
                        tval = UnitsConverter.Length.InchToMile(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }

                    else if(tv_from.equals(units[5])&&tv_to.equals(units[0])){
                        tval = UnitsConverter.Length.MileToMilli(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[5])&&tv_to.equals(units[1])){
                        tval = UnitsConverter.Length.MileToMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[5])&&tv_to.equals(units[2])){
                        tval = UnitsConverter.Length.MileToCenti(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[5])&&tv_to.equals(units[3])){
                        tval = UnitsConverter.Length.MileToKMeter(fval);
                        tval = Math.round(tval * 100000d) / 100000d;
                        t_ed.setText(String.valueOf(tval));
                    }
                    else if(tv_from.equals(units[5])&&tv_to.equals(units[4])){
                        tval = UnitsConverter.Length.MileToinch(fval);
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
