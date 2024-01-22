package Aula02;

public class APP {

    public static void main(String[] args) {
        Ganso g1 = new Ganso("Branco", 1.2f);
        System.out.println(g1.toString());

        Livro livro1 = new Livro();
        livro1.titulo = "percy jackson";
        livro1.autor = "Rick Riordan";
        livro1.anoPublicacao = 1997;

        livro1.detalhes();

        Livro livro2 = new Livro("Harry Potter", "J. K. Rowling", 1997);

        livro2.detalhes();

        Circulo circulo1 = new Circulo(23);
        circulo1.detalhes();


        Calculadora calculadora1 = new Calculadora(12, 15);

        calculadora1.detahes();

    }


}
