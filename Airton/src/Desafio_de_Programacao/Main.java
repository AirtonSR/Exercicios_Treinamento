package Desafio_de_Programacao;
public class Main {
    public static void main(String[] args) {
        Financeiro financeiro = new Financeiro();
        Dev dev = new Dev();
        Tester tester = new Tester();
        Dba dba = new Dba();
        financeiro.adicionarFuncionario(tester);
        financeiro.adicionarFuncionario(dev);
        financeiro.adicionarFuncionario(dba);
        financeiro.calcularSalario(tester, 3000);
    }
}