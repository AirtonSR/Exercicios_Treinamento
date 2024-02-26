package Aula05.cemiteriodeelefantes.gestao;
public class Empregado {
    private String nome;
    private String cpf;
    private double salario;
    private boolean estaDeFerias;
    private String departamento;
    private Departamento depar;

    public Empregado(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.estaDeFerias = false;
    }
    public void calcularBonus() {
    }
    public void mudarDepartamento(String novoDepartamento) {
        Departamento.nome = novoDepartamento;
    }
    public void iniciarFerias() {
        this.estaDeFerias = true;
    }
    public void terminarFerias() {
        this.estaDeFerias = false;
    }
    public void detalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + Departamento.nome);
    }
}
