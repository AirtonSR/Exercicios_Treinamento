package Aula05.cemiteriodeelefantes.empresa;

import java.util.List;

public class Gerente extends Funcionario {
    private List<Funcionario> subordinados;
    public Gerente(String nome, String cpf, String matricula, String departamento) {
        super(nome, cpf, matricula, departamento);
    }
}
