package Aula02;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void detalhes(){
        System.out.println("---------------Livro-----------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.anoPublicacao);
        System.out.println("------------------------------------------");
    }
}
