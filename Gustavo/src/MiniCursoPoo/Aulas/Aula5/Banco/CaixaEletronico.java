package Aula5.Banco;

public class CaixaEletronico {
    public void sacar(ContaBancaria conta, double valor) {
        conta.sacar(valor);
    }
    public void depositar(ContaBancaria conta, double valor) {
        conta.depositar(valor);
    }
}