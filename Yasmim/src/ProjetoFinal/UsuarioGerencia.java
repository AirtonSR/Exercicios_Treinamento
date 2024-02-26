package ProjetoFinal;

public class UsuarioGerencia extends Usuario {
    public UsuarioGerencia(String nome, String email) {
        super(nome, email);
    }

    @Override
    public Ocorrencia registrarOcorrencia(String descricao) {
        return new Ocorrencia(descricao, Prioridade.ALTA, this);
    }
}
