package ProjetoFinal;

public class Ocorrencia {
    private String descricao;
    private Prioridade prioridade;
    private Usuario usuario;

    public Ocorrencia(String descricao, Prioridade prioridade, Usuario usuario) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Ocorrência registrada por " + usuario.getNome() + " (" + usuario.getEmail() + "): " + descricao + " - Prioridade: " + prioridade;
    }
}
