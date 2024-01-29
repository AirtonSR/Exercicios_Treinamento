public class Avo {
    private String sobrenome;
    private String cpf;

    private String nome;

    public Avo(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("CPF: " + getCpf());
    }
}
