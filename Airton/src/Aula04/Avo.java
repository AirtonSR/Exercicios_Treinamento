package Aula04;

public class Avo {
    private String sobrenome;
    private String cpf;
    private String nome;

    public Avo(String nome, String sobrenome, String cpf) {
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void mostrarInfo() {
        System.out.println("Sobrenome: " + getSobrenome());
    }


}
