package ProjetoFinal;

public abstract class Usuario{
    private static String nome;
    private static String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public static String getNome() {
        return nome;
    }
    public static String getEmail() {
        return email;
    }
    public abstract void registrarOcorrencia(SistemaOcorrencias sistema, String descricao);

}
