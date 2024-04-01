package Aula2;
public class Livro {
    public String autor;
    public String titulo;
    public int anoPublicacao;

    public Livro(String Autor, String Tilulo, int anoPublicacao) {
        this.autor = Autor;
        this.titulo = Tilulo;
        this.anoPublicacao = anoPublicacao;
    }
    public Livro(){
    }
    public void detalhes(){
        System.out.println("Autor: " + this.autor + 
                "\nTitulo: " + this.titulo + "\nAno de Publicacao: " 
                + this.anoPublicacao);}
}
