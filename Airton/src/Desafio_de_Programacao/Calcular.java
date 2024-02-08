package Desafio_de_Programacao;

public interface Calcular {

    public enum cargo{
        DEV,
        DBA,
        TESTER;
    }
    public void CalcularSalario(cargo cargo);
}
