package Aula5.Gestao;

public class Empregado {
    //----------------------------------------------------------
    //ATRIBUTOS
    private String nome;
    private String cpf;
    private double salario;
    private boolean estaDeFerias;
    private String departamento;

    //----------------------------------------------------------
    //CONSTRUTOR
    public Empregado(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.estaDeFerias = false;
    }

    //----------------------------------------------------------
    //METODOS
    public void calcularBonus() {
        // Lógica para calcular bônus
    }
    public void mudarDepartamento(String novoDepartamento) {
        this.departamento = novoDepartamento;
        // Lógica para mudança de departamento
    }
    public void iniciarFerias() {
        this.estaDeFerias = true;
        // Lógica para iniciar as férias
    }

    //----------------------------------------------------------
    //ToString
    @Override
    public String toString() {
        return "--- Empregado ---" + '\n' +
                "Nome: " + nome + '\n' +
                "CPF: " + cpf + '\n' +
                "Salario: " + salario + '\n' +
                "Esta de ferias? " + estaDeFerias + '\n' +
                ' ';
    }
}