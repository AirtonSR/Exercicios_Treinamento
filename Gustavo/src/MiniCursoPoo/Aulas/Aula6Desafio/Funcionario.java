package Aula6Desafio;

public class Funcionario{
    //-------------------------------------------------------
    //ATRIBUTOS
    public String nome;
    public String cpf;

    public Financeiro financeiro;


    //-------------------------------------------------------
    //METODOS
    public Funcionario(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }
    //-------------------------------------------------------
    //MOSTRAR

    @Override
    public String toString() {
        return "Funcionario: " + '\n' +
                "Nome: " + nome + '\n' +
                "CPF: '" + cpf + '\n' +
                "Desconto: " + this.financeiro.desconto+ '\n' +
                "Salario Liquido: " + this.financeiro.salarioLiquido + '\n' +
                ' ';
    }

}

