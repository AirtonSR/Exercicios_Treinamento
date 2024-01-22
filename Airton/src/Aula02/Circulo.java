package Aula02;

public class Circulo {

    private float raio;
    private float pi = 3.14f;

    public Circulo(float raio) {

        this.raio = raio;
    }

    public float calcularArea(){

        return pi * (raio*raio);
    }

    void detalhes(){
        System.out.println("-------------Circulo---------------------");
        System.out.println("Area do circulo: " + this.calcularArea());
        System.out.println("------------------------------------------");
    }
}
