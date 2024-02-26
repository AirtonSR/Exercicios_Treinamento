package Aula6Desafio;

public interface ProcessarSalario {
    enum cargo{
    DEV,
    DBA,
    TESTER;
}
    void calcularDesconto(cargo cargo);
}