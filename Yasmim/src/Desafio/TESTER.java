package Desafio;
public class TESTER implements Cargo{
    @Override
    public double calculaSalarioLiquido(double salarioBruto) {
        return salarioBruto > 3000 ? salarioBruto * 0.85 : salarioBruto * 0.8;
    }
}
