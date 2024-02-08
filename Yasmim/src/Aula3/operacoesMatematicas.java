package Aula3;

public class operacoesMatematicas {
    public String calcularSomaEProduto(int numero1, int numero2){
        int soma = numero1 + numero2;
        int produto = numero1 * numero2;
        String resultado = String.format("a soma é igual a %d e o produto é igual a %d", soma, produto);
        return resultado;
    }
}
