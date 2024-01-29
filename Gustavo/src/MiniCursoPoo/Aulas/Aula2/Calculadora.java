package Aula2;

public class Calculadora {
    private int resultado;
    public int calcularSoma(int numero1, int numero2){
        this.resultado = numero1 + numero2;
        return resultado;
    }

    @Override
    public String toString() {
        return "Calculadora: " +
                "Resultado da soma = " + resultado +
                ' ';
    }
}