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
        public static double MicroToMilli(double microsec) {
            return microsec*0.001;
        }
        public static double MicroToSec(double microsec) {
            return microsec * 0.000001;
        }
        public static double MicroToMin(double microsec) {
            return microsec * 1.6667 * Math.pow(10, -8);
        }
        public static double MicroToHours(double microsec) {
            return microsec * 2.7778 * Math.pow(10, -10);
        }
        public static double MicroToDays(double ms) {
            return ms * 1.1574 * Math.pow(10, -11);
        }
        public static double MicroToMonths(double ms) {
            return ms * 3.8052 * Math.pow(10, -13);
        }
        public static double MicroToYears(double ms) {
            return ms * 3.171 * Math.pow(10, -14);
        }

        // MILLI TO X CONVERSIONS
        public static double MilliToMicro(double millis) {
            return millis*1000;
        }
        public static double MilliToSeconds(double millis) {
            return millis*0.001;
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
            return s*0.166667;
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


}
