package Aula4;
public class Pai extends Avo {

    public Pai(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nome: " + getNome());
    }
}