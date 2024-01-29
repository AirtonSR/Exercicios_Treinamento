package Aula3;

public class ConversorTemperatura {
    public double celsiusParaFahrenheit(double temperaturaCelsius){
        return (temperaturaCelsius * 1.8) + 32 ;
    }
    public static double fahrenheitParaCelsius(double temperaturaFahrenheit){
        return (temperaturaFahrenheit - 32) / 1.8;
    }
}