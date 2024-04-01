package Aula5.cemiteriodeelefantes.gestao;
class Empregado implements Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String departamento;
    private boolean estaDeFerias;

    public Empregado(String nome, String cpf, double salario, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.departamento = departamento;
        this.estaDeFerias = false;
    }

    public String getNome() {
        return nome;
    }

    public void mudarDepartamento(String novoDepartamento) {
        this.departamento = novoDepartamento;
    }

    public void iniciarFerias() {
        this.estaDeFerias = true;
    }

    @Override
    public void calcularBonus() {
        salario *= 1.1;
        System.out.printf("Salario mais bonus: %.2f\n", salario);
    }

    @Override
    public String toString() {
        return "Empregado: " +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                ", estaDeFerias=" + estaDeFerias +
                '.';
    }
}
