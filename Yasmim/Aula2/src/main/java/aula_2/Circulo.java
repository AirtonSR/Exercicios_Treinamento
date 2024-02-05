package aula_2;
public class Circulo {
    static final double PI = 3.14;
    private double raio;

    public void definirRaio(double raio) {
        this.raio = raio;
    }

    public double calcArea(double pi) {
        return pi * raio * raio;
    }
}
