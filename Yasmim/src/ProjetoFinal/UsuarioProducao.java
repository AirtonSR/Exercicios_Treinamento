package ProjetoFinal;

public class UsuarioProducao extends Usuario {

    public UsuarioProducao(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void registrarOcorrencia(SistemaOcorrencias sistema, String descricao) {
        sistema.registrarOcorrencia(this, descricao);
    }
}
