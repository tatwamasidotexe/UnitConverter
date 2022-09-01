package com.example.unitconverter;
import java.lang.Math;

class UnitsConverter{

    static class Temp{
        public static double FarToKelvin(double far)
        {
            return ((far+459.67)*5/9);
        }

        public static double KelvinToFar(double kelvin)
        {
            return ((kelvin*9/5)-459.67);
        }

        public static double CelToKelvin(double cel)
        {
            return (cel+273.15);
        }

        public static double KelvinToCel(double kelvin)
        {
            return (kelvin-273.15);
        }

        public static double CelToFar(double cel){ return (cel*9/5+32); }

        public static double FarToCel(double far){ return ((far-32)*5/9.0); }
    }

    static class Time {

        // MICRO TO X CONVERSIONS
        public static double MicroToMilli(double micros) {
            return micros*0.001;
        }
        public static double MicroToSec(double micros) { return micros * 0.000001; }
        public static double MicroToMin(double micros) { return micros/( 6 * Math.pow(10, 7)); }
        public static double MicroToHours(double micros) {return micros/( 3.6 * Math.pow(10, 9));}
        public static double MicroToDays(double micros) {
            return micros/( 8.64 * Math.pow(10, 10));
        }
        public static double MicroToMonths(double micros) {
            return micros/( 2.628 * Math.pow(10, 12));
        }
        public static double MicroToYears(double micros) {
            return micros/( 3.154 * Math.pow(10, 13));
        }

        // MILLI TO X CONVERSIONS
        public static double MilliToMicro(double millis) {
            return millis*1000;
        }
        public static double MilliToSeconds(double millis) {
            return millis/1000;
        }
        public static double MilliToMinutes(double millis) {
            return millis*1.667*Math.pow(10, -5);
        }
        public static double MilliToHours(double millis) {
            return millis*2.7778*Math.pow(10, -7);
        }
        public static double MilliToDays(double millis) {
            return millis*1.1574*Math.pow(10, -8);
        }
        public static double MilliToMonths(double millis) {
            return millis*3.8052*Math.pow(10, -10);
        }
        public static double MilliToYears(double millis) {
            return millis*3.171*Math.pow(10, -11);
        }

        // SEC TO X CONVERSIONS
        public static double SecToMicro(double s) {
            return s*Math.pow(10, 6);
        }
        public static double SecToMilli(double s) {
            return s*Math.pow(10, 3);
        }
        public static double SecToMin(double s) {
            return s/60;
        }
        public static double SecToHour(double s) {
            return s*0.000277778;
        }
        public static double SecToDays(double s) {
            return s*1.1574*Math.pow(10, -5);
        }
        public static double SecToMonths(double s) {
            return s*3.805*Math.pow(10, -7);
        }
        public static double SecToYears(double s) {
            return s*3.17098*Math.pow(10, -8);
        }

        // MIN TO X CONVERSIONS
        public static double MinToMicro(double s) {
            return s*6*Math.pow(10, 7);
        }
        public static double MinToMilli(double s) {
            return s*6*Math.pow(10, 4);
        }
        public static double MinToSec(double s) {
            return s*60;
        }
        public static double MinToHour(double s) {
            return s*0.0166667;
        }
        public static double MinToDays(double s) {
            return s*0.000694444;
        }
        public static double MinToMonths(double s) {
            return s*2.2831*Math.pow(10, -5);
        }
        public static double MinToYears(double s) {
            return s*1.9026*Math.pow(10, -6);
        }

        // HOUR TO X CONVERSIONS
        public static double HourToMicro(double s) {
            return s*3.6*Math.pow(10, 9);
        }
        public static double HourToMilli(double s) {
            return s*3.6*Math.pow(10, 6);
        }
        public static double HourToSec(double s) {
            return s*3600;
        }
        public static double HourToMin(double s) {
            return s*60;
        }
        public static double HourToDays(double s) {
            return s*0.0416667;
        }
        public static double HourToMonths(double s) {
            return s*0.00136986;
        }
        public static double HourToYears(double s) {
            return s*0.000114155;
        }

        // DAYS TO X CONVERSIONS
        public static double DaysToMicro(double s) {
            return s*8.64*Math.pow(10, 10);
        }
        public static double DaysToMilli(double s) {
            return s*8.64*Math.pow(10, 7);
        }
        public static double DaysToSec(double s) {
            return s*86400;
        }
        public static double DaysToMin(double s) {
            return s*1440;
        }
        public static double DaysToHours(double s) {
            return s*24;
        }
        public static double DaysToMonths(double s) {
            return s*0.0328767;
        }
        public static double DaysToYears(double s) {
            return s*0.00273973;
        }

        // MONTHS TO X CONVERSIONS
        public static double MonthsToMicro(double s) {
            return s*2.628*Math.pow(10, 12);
        }
        public static double MonthsToMilli(double s) {
            return s*2.628*Math.pow(10, 9);
        }
        public static double MonthsToSec(double s) {
            return s*2.628*Math.pow(10, 6);
        }
        public static double MonthsToMin(double s) {
            return s*43800;
        }
        public static double MonthsToHours(double s) {
            return s*730.001;
        }
        public static double MonthsToDays(double s) {
            return s*30.4167;
        }
        public static double MonthsToYears(double s) {
            return s*0.0833334;
        }

        // YEARS TO X CONVERSIONS
        public static double YearsToMicro(double s) {
            return s*3.154*Math.pow(10, 13);
        }
        public static double YearsToMilli(double s) {
            return s*3.154*Math.pow(10, 10);
        }
        public static double YearsToSec(double s) {
            return s*3.154*Math.pow(10, 7);
        }
        public static double YearsToMin(double s) {
            return s*525600;
        }
        public static double YearsToHours(double s) {
            return s*8760;
        }
        public static double YearsToDays(double s) {
            return s*365;
        }
        public static double YearsToMonths(double s) {
            return s*12;
        }

    }

    static class Mass{
        public static double TonToKg(double ton)
        {
            return (ton*1000);
        }

        public static double TonToGram(double ton)
        {
            return (ton*1000000);
        }

        public static double TonToMg(double ton)
        {
            return (ton*1000000000);
        }

        public static double KgToTon(double kg)
        {
            return (kg/1000);
        }

        public static double KgToGram(double kg)
        {
            return (kg*1000);
        }

        public static double KgToMg(double kg)
        {
            return (kg*1000000);
        }

        public static double GramToTon(double gram)
        {
            return (gram/1000000);
        }

        public static double GramToKg(double gram)
        {
            return (gram/1000);
        }

        public static double GramToMg(double gram)
        {
            return (gram*1000);
        }

        public static double MgToTon(double mg)
        {
            return (mg/1000000000);
        }

        public static double MgToKg(double mg)
        {
            return (mg/1000000);
        }

        public static double MgToGram(double mg)
        {
            return (mg/1000);
        }
    }

    public static class Length{

        public static double MilliToMeter(double milli)
        {
            return (milli/1000);
        }
        public static double MilliToCMeter(double milli)
        {
            return (milli/10);
        }
        public static double MilliToKMeter(double milli)
        {
            return (milli/1000000);
        }
        public static double MilliToinch(double milli)
        {
            return (milli/25.4);
        }
        public static double MilliTomile(double milli)
        {
            return (milli/(1.609)*1000000);
        }

        public static double MeterToMilli(double meter)
        {
            return (meter*1000);
        }
        public static double MeterToCenti(double meter)
        {
            return (meter*100);
        }
        public static double MeterToInch(double meter)
        {
            return (meter*39.3701);
        }
        public static double MeterToMile(double meter)
        {
            return (meter*0.000621371);
        }
        public static double MeterToKMeter(double meter)
        {
            return (meter/1000);
        }

        public static double CentiToMeter(double Centi)
        {
            return (Centi/100);
        }
        public static double CentiToMilli(double Centi)
        {
            return (Centi*10);
        }
        public static double CentiToKMeter(double Centi)
        {
            return (Centi/100000);
        }
        public static double CentiToinch(double Centi)
        {
            return (Centi*0.393701);
        }
        public static double CentiToMile(double Centi)
        {
            return ((Centi*6.21371)/1000000);
        }



        public static double KiloToMeter(double Kilo)
        {
            return (Kilo*1000);

        }
        public static double KiloToCenti(double Kilo)
        {
            return (Kilo*100000);

        }
        public static double KiloToinch(double Kilo)
        {
            return (Kilo*39370.1);

        }
        public static double KiloToMile(double Kilo)
        {
            return (Kilo*0.621371);

        }
        public static double KiloToMilli(double Kilo)
        {
            return (Kilo*1000000);

        }



        public static double InchToMeter(double Inch)
        {
            return (Inch/39.3701);
        }
        public static double InchToMilli(double Inch)
        {
            return (Inch*25.4);
        }
        public static double InchToCenti(double Inch)
        {
            return (Inch*2.54);
        }
        public static double InchToKilo(double Inch)
        {
            return ((Inch*2.54)/100000);
        }
        public static double InchToMile(double Inch)
        {
            return ((Inch*1.57828)/100000);
        }



        public static double MileToMeter(double Mile)
        {
            return (Mile/0.000621371);
        }
        public static double MileToMilli(double Mile)
        {
            return (Mile*1.609);
        }
        public static double MileToCenti(double Mile)
        {
            return (Mile/0.000621371);
        }
        public static double MileToKMeter(double Mile)
        {
            return (Mile/0.000621371);
        }
        public static double MileToinch(double Mile)
        {
            return (Mile/0.000621371);
        }




    }


}
