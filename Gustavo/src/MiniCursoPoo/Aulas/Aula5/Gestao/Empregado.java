package Aula5.Gestao;

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

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", estaDeFerias=" + estaDeFerias +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}