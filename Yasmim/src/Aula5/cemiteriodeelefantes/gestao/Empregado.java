package Aula5.cemiteriodeelefantes.gestao;

public class Empregado {
    private String nome;
    private String cpf;
    private double salario;
    private boolean estaDeFerias;
    private String departamento;
    public Empregado(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.estaDeFerias = false;
    }
    public void calcularBonus() {

        System.out.println("Calcular bonus para o empregado " + nome);
    }
    public void mudarDepartamento(String novoDepartamento) {
        this.departamento = novoDepartamento;
        System.out.println("O empregado " + nome + " mudou de departamento para " + novoDepartamento);
    }
    public void iniciarFerias() {
        this.estaDeFerias = true;
        System.out.println("O empregado " + nome + " começou as ferias");
    }
}
