package ProjetoFinal;

public class UsuarioProducao extends Usuario {

    public UsuarioProducao(String nome, String email) {
        super(nome, email);
    }

    @Override
    public Ocorrencia registrarOcorrencia(String descricao) {
        return new Ocorrencia(descricao, Prioridade.BAIXA, this);
    }
}
