package Aula02;

public class Calculadora {
    private float numero1;
    private float numero2;

    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float calcularSoma(){

        return numero1 + numero2;
    }

    void detahes(){
        System.out.println("-----------Calculadora----------------------");
        System.out.println("Soma " + this.calcularSoma());
        System.out.println("------------------------------------------");
    }
}
