package Aula3;
public class ManipuladorDeNumero {
    public void elevarQuadrado(int numero){
        if(numero > 0 | numero < 0){
            numero = numero * numero;
            System.out.println(numero);
        } else {
            System.out.println("0 não pode ser elevado");
        }
    }
}