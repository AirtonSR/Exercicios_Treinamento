package Aula5.Empresa;

import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> subordinados;
    private String departamento;
    public Gerente(String departamento) {
        super("Gerente", "00000000000", "000000");
        this.departamento = departamento;
    }
}