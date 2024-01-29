package Aula4;
public class Pai extends Avo{
    private String nome;
    public Pai(String nome, String sobrenome, String cpf) {
        super(sobrenome, cpf);
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nome: " + getNome());
    }
}
