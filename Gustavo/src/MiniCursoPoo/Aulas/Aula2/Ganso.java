package Aula2;

public class Ganso {
    private String cor;
    private double altura;

    public Ganso(String cor, double altura) {
        this.cor = cor;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return " " + "Cor: " + cor + "\nAltura: " + altura + ' ';
    }
}
