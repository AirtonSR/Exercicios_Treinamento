package Aula3;
public class Aula3 {
    public static void main(String[] args) {
        System.out.println("Exercicio 1: \n");
        
        Calc calculadora = new Calc();
        // métodos inteiros
        int resultadoInteiro = calculadora.somar(8, 4);
        System.out.println("Soma de inteiros: " + resultadoInteiro);
        //métodos floats
        double resultadoDouble = calculadora.somar(2.8, 3.7);
        System.out.println("Soma de double's: " + resultadoDouble);
        //Metodos longs
        long resultadoLong = calculadora.somar(170L, 290L);
        System.out.println("Soma de long's: " + resultadoLong);
        
        System.out.println("\n Exercicio 2: \n");
        
        ManipuladorNumeros manipulador = new ManipuladorNumeros();
        
        int resultado = manipulador.elevarAoQuadrado(10);
        System.out.println("O quadrado é: " + resultado);
        
        System.out.println("\n Exercicio 3: \n");
        
        ConversorTemperatura conversor = new ConversorTemperatura();
        
        /*double tempCelsius = conversor.celsiusParaFahrenheit(20.0);
        double tempFahrenheit = conversor.fahrenheitParaCelsius(35);
        System.out.println("A coneversão de " + tempCelsius + " celsius, para fahrenheit é " + tempFahrenheit); 
        */
        System.out.println(conversor.celsiusParaFahrenheit(32));
        System.out.println(conversor.fahrenheitParaCelsius(90));
        
                
        System.out.println("\n Exercicio 4: \n");
        
        operacoesMatematicas op = new operacoesMatematicas();
        System.out.println(op.calcularSomaEProduto(2, 3));
        
    }
}
