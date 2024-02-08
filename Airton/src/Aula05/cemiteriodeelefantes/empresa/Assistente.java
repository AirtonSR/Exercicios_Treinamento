package org.example.lesson_05.cemiteriodeelefantes.empresa;

public class Assistente extends Funcionario {
    private String data_de_admissao;
    public Assistente(String nome, String cpf, String matricula, String departamento, String data_de_admissao) {
        super(nome, cpf, matricula, departamento);
        this.data_de_admissao = data_de_admissao;
    }
}
