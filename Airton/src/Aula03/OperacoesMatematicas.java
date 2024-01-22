package Aula03;

public class OperacoesMatematicas {
    public String soma(int n1, int n2){
        double soma = n1 + n2;
        double produto = n1 * n2;
        String resultado = String.format("soma: %.2f\nproduto: %.2f", soma, produto);
        return resultado;
    }

}
