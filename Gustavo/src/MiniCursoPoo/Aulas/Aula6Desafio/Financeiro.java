package Aula6Desafio;

public class Financeiro implements ProcessarSalario {
    //-------------------------------------------------------
    //ATRIBUTOS
    protected static double desconto;
    protected static double salarioLiquido;
    public Funcionario funcionario;

    //-------------------------------------------------------
    //CONSTRUTOR


    public Financeiro(double salarioLiquido, Funcionario funcionario) {
        this.salarioLiquido = salarioLiquido;
    }

    //-------------------------------------------------------
    //METODOS
    @Override
    public void calcularDesconto(cargo cargo) {
        switch (cargo) {
            //-------------------------------------------------------
            //CASO 1
            case DEV:
                if (salarioLiquido > 3000) {
                    desconto = salarioLiquido - (salarioLiquido / 100) * 10;
                }
                //-------------------------------------------------------
                // CASO 2
            case DBA:
                if (salarioLiquido > 3000) {
                    desconto = (salarioLiquido / 100) * 15;
                }
                //-------------------------------------------------------
                //CASO 3
            case TESTER:
                if (salarioLiquido > 3000) {
                    desconto = (salarioLiquido / 100) * 15;
                }
        }
    }
}