package Desafio_de_Programacao;

public class Financeiro implements Calcular {
    private String nome;
    private double salario;
    private double salarioBruto;

    public Financeiro(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }
    @Override
    public void calcularSalario(Calcular.cargo cargo) {
        switch (cargo) {
            case DEV:
                if (salario > 3000) {
                    double porcentagem = (salario * 10) / 100;
                    salarioBruto = salario - porcentagem;
                    System.out.println("Salario Bruto é: " + salarioBruto);
                } else if (salario <= 3000) {
                    double porcentagem = (salario * 20) / 100;
                    salarioBruto = salario - porcentagem;
                    System.out.println("Salario Bruto é: " + salarioBruto);
                }
                break;
            case DBA:
                System.out.println("Salario Bruto é: " + calcularSalarioBruto());
                break;
            case TESTER:
                System.out.println("Salario Bruto é: " + calcularSalarioBruto());
                break;

        }
    }
    private double calcularSalarioBruto() {
        if (salario > 3000) {
            double porcentagem = (salario * 15) / 100;
            salarioBruto = salario - porcentagem;
        } else if (salario <= 3000) {
            double porcentagem = (salario * 20) / 100;
            salarioBruto = salario - porcentagem;
        }
        return salarioBruto;
    }
}
