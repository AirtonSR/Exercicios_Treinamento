package Desafio_de_Programacao;

public class Financeiro implements implementacoes{
    public String nome;
    private double salarioLiquido;
    private double salarioBruto;
    public Financeiro(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }
    @Override
    public void calcularSalario(cargo cargo) {
        switch (cargo){
            case DEV:
                if(salarioBruto > 3000){
                    salarioLiquido = salarioBruto - ((salarioBruto * 10) / 100);
                    break;
                } else if (salarioBruto <= 3000) {
                    salarioLiquido = salarioBruto - ((salarioBruto * 15) / 100);
                    break;
                }
            case TESTER:
            case DBA:
                calcularPorcentagem();
                break;
        }
        System.out.printf("Seu salario é: %.2f R$", salarioLiquido);
    }
    private double calcularPorcentagem(){
        if(salarioBruto > 3000){
            salarioLiquido = salarioBruto - ((salarioBruto * 15) / 100);
        } else if (salarioBruto <= 3000) {
            salarioLiquido = salarioBruto - ((salarioBruto * 20) / 100);
        }
        return salarioLiquido;
    }
}