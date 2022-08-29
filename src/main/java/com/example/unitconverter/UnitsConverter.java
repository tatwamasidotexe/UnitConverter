package com.example.unitconverter;

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


}
