package Aula5.Gestao;
public class Gerente implements Gestao{
    //----------------------------------------------------------
    //CONSTRUTOR
    private String nome;
    private String cpf;
    private double salario;

    public Gerente(String nome, String cpf, double salario, Departamento departamento) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
    }
    //----------------------------------------------------------
    //METODOS
    @Override
    public void adicionarEmpregado(Empregado empregado) {
    }
    @Override
    public void removerEmpregado(Empregado empregado) {
    }

    @Override
    public String toString() {
        return "--- Gerente --- " + '\n' +
                "Nome: " + nome + '\n' +
                "CPF: " + cpf + '\n' +
                "Salario: " + salario +
                ' ';
    }
}
