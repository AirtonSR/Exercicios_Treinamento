package Desafio;
public class Funcionario {
    private String nome;
    private Cargo cargo;
    private double salarioBruto;

    public Funcionario(String nome, Cargo cargo, double salarioBruto){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }
    public double calcularSalarioLiquido() {
        double desconto;

        if (cargo == Cargo.DEV) {
            desconto = (salarioBruto > 3000) ? salarioBruto * 0.1 : salarioBruto * 0.2;
        } else {
            desconto = (salarioBruto > 3000) ? salarioBruto * 0.15 : salarioBruto * 0.2;
        }

        return salarioBruto - desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
