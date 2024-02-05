package Aula5.Empresa;

public class Assistente extends Funcionario {
    private String departamento;

    public Assistente(String nome, String cpf, String matricula, String departamento) {
        super(nome, cpf, matricula);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
