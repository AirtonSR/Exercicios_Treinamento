package Aula3;

public class OperacoesMatematicas {
    public String soma(int numero1, int numero2){
        double soma = numero1 + numero2;
        double produto = numero1 * numero2;
        String resultado = String.format("soma: %.2f\nproduto: %.2f", soma, produto);
        return resultado;
    }
}