package Desafio;

public class DEV implements Cargo{
    @Override
    public double calculaSalarioLiquido(double salarioBruto) {
        return salarioBruto > 3000 ? salarioBruto * 0.9 : salarioBruto * 0.8;
    }
}