package Desafio_de_Programacao;

public interface Calcular {

    public enum cargo{
        DEV,
        DBA,
        TESTER;
    }
    public void calcularSalario(cargo cargo);
}
