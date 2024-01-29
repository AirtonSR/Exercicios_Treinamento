package Aula2;

public class Main {
    public static void main(String[] args) {

        Ganso ganso = new Ganso("Azul", 34);
        System.out.println("------- Gansos -------");
        System.out.println(ganso.toString());

        Livro livro = new Livro("aaa","gust",2010);
        System.out.println("------- Livro -------");
        System.out.println(livro.toString());

        Circulo circulo = new Circulo();
        System.out.println("------- Circulo -------");
        circulo.calcularArea(1);
        System.out.println(circulo.toString());

        Calculadora calcSoma = new Calculadora();
        System.out.println("------- Calculadora -------");
        calcSoma.calcularSoma(2, 10);
        System.out.println(calcSoma.toString());

    }
}