package Aula3;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(1);

        ManipuladorDeNumero manipular = new ManipuladorDeNumero();
        manipular.elevarQuadrado(8);

        ConversorTemperatura conversor = new ConversorTemperatura();
        System.out.println(conversor.celsiusParaFahrenheit(32));
        System.out.println(ConversorTemperatura.fahrenheitParaCelsius(90));

        OperacoesMatematicas operacoesMatematicas = new OperacoesMatematicas();
        System.out.println(operacoesMatematicas.soma(32, 68));
    }
}