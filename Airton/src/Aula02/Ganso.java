package Aula02;

public class Ganso {
    private String corDaEspulma;
    private float altura;

    public Ganso(String corDaEspulma, float altura) {
        this.corDaEspulma = corDaEspulma;
        this.altura = altura;

    }

    @Override
    public String toString() {
        return "Ganso{" +
                "corDaEspulma='" + corDaEspulma + '\'' +
                ", altura=" + altura +
                '}';
    }
}
