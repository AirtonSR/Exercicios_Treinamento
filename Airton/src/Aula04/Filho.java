package Aula04;

public class Filho extends Pai {
    private String brinquedoFavorito;
    public Filho(String nome, String sobrenome, String cpf, String brinquedoFavorito) {
        super(nome, sobrenome, cpf);
        this.brinquedoFavorito = brinquedoFavorito;
    }

    public Filho(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public String getBrinquedoFavorito() {
        return brinquedoFavorito;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Brinquedo Favorito: " + getBrinquedoFavorito());
    }

}