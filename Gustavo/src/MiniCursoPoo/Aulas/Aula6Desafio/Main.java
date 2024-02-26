package Aula6Desafio;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("aaa", "123.456.789-00");
        Financeiro financeiro = new Financeiro(3500, funcionario);
        financeiro.calcularDesconto(ProcessarSalario.cargo.DBA);
        System.out.println(funcionario.toString());
    }
}