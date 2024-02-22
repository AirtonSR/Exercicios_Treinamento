package Desafio;
public class Funcionario {
    private String nome;
    private Cargo cargo;
    private double salarioBruto;

    public Funcionario(String nome, Cargo cargo, double salarioBruto) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }
    public double calcularSalarioLiquido(){
        return cargo.calculaSalarioLiquido(salarioBruto);
    }
    @Override
    public String toString() {
        return "Funcionario" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", salarioBruto=" + salarioBruto +
                ", Salario Liquido: " + calcularSalarioLiquido() +
                ".";
    }
}
