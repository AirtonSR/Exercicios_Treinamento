package Aula03;

public class Main {
    public static void main(String[] args) {

        Classes c = new Classes();
        System.out.println(c.somar(4 , 5));
        System.out.println(c.somar(3.5, 2.4));
        System.out.println(c.somar("Airton", "Jose"));

        System.out.println("----------------");
        ManipuladorNumeros mn = new ManipuladorNumeros();
        System.out.println(mn.levarQuadrado(3,5));
        System.out.println("----------------");

        ConversoTemperatura ct = new ConversoTemperatura();
        System.out.println(ct.CelsiusParaFahrenheit(34));
        System.out.println(ConversoTemperatura.fahrenheitParaCelsius(70));
        System.out.println("-----------------");

        OperacoesMatematicas op = new OperacoesMatematicas();
        System.out.println(op.soma(23, 5));
    }
}
