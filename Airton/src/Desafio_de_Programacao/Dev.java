package Desafio_de_Programacao;
public class Dev implements Calcular{
    private double salarioLiquido;
    @Override
    public double calcularSalario(double valor) {
        if(valor > 3000){
            salarioLiquido = valor - (valor * 0.15);
        }else{
            salarioLiquido = valor - (valor * 0.20);
        }
        return salarioLiquido;
    }
}
