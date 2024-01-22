package Aula03;

import java.util.Scanner;

public class ConversoTemperatura {
    public double CelsiusParaFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }

}
