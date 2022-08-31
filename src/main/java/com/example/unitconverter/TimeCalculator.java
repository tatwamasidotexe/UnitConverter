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

public class TimeCalculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] units = {"microseconds", "milliseconds","seconds", "minutes", "hours", "days","months", "years"};
    Spinner toDropdown , fromDropdown;
    EditText fromTextField,toTextField;
    String fromDD_text,toDD_text;
    TextView head;
    CardView calc;
    double fromInput, toDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_ui);
        fromDropdown = findViewById(R.id.FromDropdown);
        toDropdown = findViewById(R.id.ToDropdown);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, units);
        ad.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        toDropdown.setPrompt("Select");
        fromDropdown.setPrompt("Select");
        toDropdown.setAdapter(ad);
        fromDropdown.setAdapter(ad);

        head = findViewById(R.id.Heading);
        head.setText("Time");

        //flabel = findViewById(R.id.f_unit);
        //tlabel = findViewById(R.id.t_unit);

        fromTextField = findViewById(R.id.FromVal);
        toTextField = findViewById(R.id.ToVal);

        toDropdown.setOnItemSelectedListener(this);
        fromDropdown.setOnItemSelectedListener(this);

        calc = findViewById(R.id.convert);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(fromTextField.getText().toString())){
                    Toast.makeText(TimeCalculator.this,"Please Enter Value",Toast.LENGTH_SHORT).show();}//copy till here for all
                else{
                    fromInput = Double.parseDouble(fromTextField.getText().toString());
                    if (fromDD_text.equals(toDD_text)){
                        toDisplay = fromInput;

                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // microseconds to milliseconds
                    else if(fromDD_text.equals(units[0]) && toDD_text.equals(units[1])){
                        toDisplay = UnitsConverter.Time.MicroToMilli(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // microsecs to seconds
                    else if(fromDD_text.equals(units[0]) && toDD_text.equals(units[2])){
                        toDisplay = UnitsConverter.Time.MicroToSec(fromInput);
                        toDisplay = Math.round(toDisplay * 10000000d) / 10000000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // micro s to mins
                    else if(fromDD_text.equals(units[0])&&toDD_text.equals(units[3])){
                        toDisplay = UnitsConverter.Time.MicroToMin(fromInput);
                        toDisplay = Math.round(toDisplay * 1000000000d) / 1000000000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // micro s to hours
                    else if(fromDD_text.equals(units[0])&&toDD_text.equals(units[4])){
                        toDisplay = UnitsConverter.Time.MicroToHours(fromInput);
                        toDisplay = Math.round(toDisplay * 1000000000d) / 1000000000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // micro s to days
                    else if(fromDD_text.equals(units[0])&&toDD_text.equals(units[5])){
                        toDisplay = UnitsConverter.Time.MicroToDays(fromInput);
                        toDisplay = Math.round(toDisplay * 1000000000000d) / 1000000000000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // micro s to months
                    else if(fromDD_text.equals(units[0])&&toDD_text.equals(units[6])){
                        toDisplay = UnitsConverter.Time.MicroToMonths(fromInput);
                        toDisplay = Math.round(toDisplay * 1000000000000d) / 1000000000000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // micro s to years
                    else if(fromDD_text.equals(units[0])&&toDD_text.equals(units[7])){
                        toDisplay = UnitsConverter.Time.MicroToYears(fromInput);
                        toDisplay = Math.round(toDisplay * 1000000000000d) / 1000000000000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // milli to micro
                    else if(fromDD_text.equals(units[1])&&toDD_text.equals(units[0])){
                        toDisplay = UnitsConverter.Time.MilliToMicro(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // milli to seconds
                    else if(fromDD_text.equals(units[1])&&toDD_text.equals(units[2])){
                        toDisplay = UnitsConverter.Time.MilliToSeconds(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // milli to MINS
                    else if(fromDD_text.equals(units[1])&&toDD_text.equals(units[3])){
                        toDisplay = UnitsConverter.Time.MilliToMinutes(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // milli to hours
                    else if(fromDD_text.equals(units[1])&&toDD_text.equals(units[4])){
                        toDisplay = UnitsConverter.Time.MilliToHours(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // milli to days
                    else if(fromDD_text.equals(units[1])&&toDD_text.equals(units[5])){
                        toDisplay = UnitsConverter.Time.MilliToDays(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // milli to months
                    else if(fromDD_text.equals(units[1])&&toDD_text.equals(units[6])){
                        toDisplay = UnitsConverter.Time.MilliToMonths(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // milli to years
                    else if(fromDD_text.equals(units[1])&&toDD_text.equals(units[7])){
                        toDisplay = UnitsConverter.Time.MilliToYears(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // s to micro
                    else if(fromDD_text.equals(units[2])&&toDD_text.equals(units[0])){
                        toDisplay = UnitsConverter.Time.SecToMicro(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // s to milli
                    else if(fromDD_text.equals(units[2])&&toDD_text.equals(units[1])){
                        toDisplay = UnitsConverter.Time.SecToMilli(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // s to min
                    else if(fromDD_text.equals(units[2])&&toDD_text.equals(units[3])){
                        toDisplay = UnitsConverter.Time.SecToMin(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // s to hour
                    else if(fromDD_text.equals(units[2])&&toDD_text.equals(units[4])){
                        toDisplay = UnitsConverter.Time.SecToHour(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // s to day
                    else if(fromDD_text.equals(units[2])&&toDD_text.equals(units[5])){
                        toDisplay = UnitsConverter.Time.SecToDays(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // s to month
                    else if(fromDD_text.equals(units[2])&&toDD_text.equals(units[6])){
                        toDisplay = UnitsConverter.Time.SecToMonths(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // s to year
                    else if(fromDD_text.equals(units[2])&&toDD_text.equals(units[7])){
                        toDisplay = UnitsConverter.Time.SecToYears(fromInput);
                        toDisplay = Math.round(toDisplay * 1000000000d) / 1000000000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // min to micro
                    else if(fromDD_text.equals(units[3])&&toDD_text.equals(units[0])){
                        toDisplay = UnitsConverter.Time.MinToMicro(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // min to milli
                    else if(fromDD_text.equals(units[3])&&toDD_text.equals(units[1])){
                        toDisplay = UnitsConverter.Time.MinToMilli(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // min to s
                    else if(fromDD_text.equals(units[3])&&toDD_text.equals(units[2])){
                        toDisplay = UnitsConverter.Time.MinToSec(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // min to hour
                    else if(fromDD_text.equals(units[3])&&toDD_text.equals(units[4])){
                        toDisplay = UnitsConverter.Time.MinToHour(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // min to day
                    else if(fromDD_text.equals(units[3])&&toDD_text.equals(units[5])){
                        toDisplay = UnitsConverter.Time.MinToDays(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // min to month
                    else if(fromDD_text.equals(units[3])&&toDD_text.equals(units[6])){
                        toDisplay = UnitsConverter.Time.MinToMonths(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // min to year
                    else if(fromDD_text.equals(units[3])&&toDD_text.equals(units[7])){
                        toDisplay = UnitsConverter.Time.MinToYears(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // hour to micro s
                    else if(fromDD_text.equals(units[4])&&toDD_text.equals(units[0])){
                        toDisplay = UnitsConverter.Time.HourToMicro(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // hour to milli s
                    else if(fromDD_text.equals(units[4])&&toDD_text.equals(units[1])){
                        toDisplay = UnitsConverter.Time.HourToMilli(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // hour to s
                    else if(fromDD_text.equals(units[4])&&toDD_text.equals(units[2])){
                        toDisplay = UnitsConverter.Time.HourToSec(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // hour to min
                    else if(fromDD_text.equals(units[4])&&toDD_text.equals(units[3])){
                        toDisplay = UnitsConverter.Time.HourToMin(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // hour to days
                    else if(fromDD_text.equals(units[4])&&toDD_text.equals(units[5])){
                        toDisplay = UnitsConverter.Time.HourToDays(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // hour to months
                    else if(fromDD_text.equals(units[4])&&toDD_text.equals(units[6])){
                        toDisplay = UnitsConverter.Time.HourToMonths(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // hour to years
                    else if(fromDD_text.equals(units[4])&&toDD_text.equals(units[7])){
                        toDisplay = UnitsConverter.Time.HourToYears(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }

                    // days to micro s
                    else if(fromDD_text.equals(units[5])&&toDD_text.equals(units[0])){
                        toDisplay = UnitsConverter.Time.DaysToMicro(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // days to milli s
                    else if(fromDD_text.equals(units[5])&&toDD_text.equals(units[1])){
                        toDisplay = UnitsConverter.Time.DaysToMilli(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // days to s
                    else if(fromDD_text.equals(units[5])&&toDD_text.equals(units[2])){
                        toDisplay = UnitsConverter.Time.DaysToSec(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // days to min
                    else if(fromDD_text.equals(units[5])&&toDD_text.equals(units[3])){
                        toDisplay = UnitsConverter.Time.DaysToMin(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // days to hour
                    else if(fromDD_text.equals(units[5])&&toDD_text.equals(units[4])){
                        toDisplay = UnitsConverter.Time.DaysToHours(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // days to months
                    else if(fromDD_text.equals(units[5])&&toDD_text.equals(units[6])){
                        toDisplay = UnitsConverter.Time.DaysToMonths(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // days to years
                    else if(fromDD_text.equals(units[5])&&toDD_text.equals(units[7])){
                        toDisplay = UnitsConverter.Time.DaysToYears(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }

                    // months to micro s
                    else if(fromDD_text.equals(units[6])&&toDD_text.equals(units[0])){
                        toDisplay = UnitsConverter.Time.MonthsToMicro(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // months to milli s
                    else if(fromDD_text.equals(units[6])&&toDD_text.equals(units[1])){
                        toDisplay = UnitsConverter.Time.MonthsToMilli(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // months to s
                    else if(fromDD_text.equals(units[6])&&toDD_text.equals(units[2])){
                        toDisplay = UnitsConverter.Time.MonthsToSec(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // months to min
                    else if(fromDD_text.equals(units[6])&&toDD_text.equals(units[3])){
                        toDisplay = UnitsConverter.Time.MonthsToMin(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // months to hour
                    else if(fromDD_text.equals(units[6])&&toDD_text.equals(units[4])){
                        toDisplay = UnitsConverter.Time.MonthsToHours(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // months to days
                    else if(fromDD_text.equals(units[6])&&toDD_text.equals(units[5])){
                        toDisplay = UnitsConverter.Time.MonthsToDays(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // months to years
                    else if(fromDD_text.equals(units[6])&&toDD_text.equals(units[7])){
                        toDisplay = UnitsConverter.Time.MonthsToYears(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }

                    // years to micro s
                    else if(fromDD_text.equals(units[7])&&toDD_text.equals(units[0])){
                        toDisplay = UnitsConverter.Time.YearsToMicro(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // years to milli s
                    else if(fromDD_text.equals(units[7])&&toDD_text.equals(units[1])){
                        toDisplay = UnitsConverter.Time.YearsToMilli(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // years to s
                    else if(fromDD_text.equals(units[7])&&toDD_text.equals(units[2])){
                        toDisplay = UnitsConverter.Time.YearsToSec(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // years to min
                    else if(fromDD_text.equals(units[7])&&toDD_text.equals(units[3])){
                        toDisplay = UnitsConverter.Time.YearsToMin(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // years to hour
                    else if(fromDD_text.equals(units[7])&&toDD_text.equals(units[4])){
                        toDisplay = UnitsConverter.Time.YearsToHours(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // years to days
                    else if(fromDD_text.equals(units[7])&&toDD_text.equals(units[5])){
                        toDisplay = UnitsConverter.Time.YearsToDays(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }
                    // years to months
                    else if(fromDD_text.equals(units[7])&&toDD_text.equals(units[6])){
                        toDisplay = UnitsConverter.Time.YearsToMonths(fromInput);
                        toDisplay = Math.round(toDisplay * 100000d) / 100000d;
                        toTextField.setText(String.valueOf(toDisplay));
                    }

                }
            }

        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        fromDD_text  = fromDropdown.getSelectedItem().toString();
        toDD_text = toDropdown.getSelectedItem().toString();
        toTextField.setText("");

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        fromDD_text  = fromDropdown.getSelectedItem().toString();
        toDD_text = toDropdown.getSelectedItem().toString();
    }



}
