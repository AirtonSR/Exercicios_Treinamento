package Aula5.cemiteriodeelefantes.empresa;

public class Funcionario {
    public String nome;
    private String cpf;
    private String matricula;
    public String departamento;

    public Funcionario(String nome, String cpf, String matricula, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.departamento = departamento;
    }
}
