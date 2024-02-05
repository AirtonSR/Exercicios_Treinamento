package Aula2;

public class Circulo{
    private double raio;

    /*
    public Circulo(double raio) {
        this.raio = raio * Math.PI;
    }
    */
    public double calcularArea(double valorRaio){
        double valorRaio2 = valorRaio * valorRaio;
        raio = valorRaio2 * Math.PI;
        return raio;
    }

    public String toString() {
        return "Circulo class: " +
                "Area: " + raio +
                ' ';
    }
}