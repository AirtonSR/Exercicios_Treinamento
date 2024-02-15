package Desafio_de_Programacao;

public interface implementacoes {
    enum cargo{
        DEV,
        TESTER,
        DBA;
    }
    void calcularSalario(cargo cargo);
}