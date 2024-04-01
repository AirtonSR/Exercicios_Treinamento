package ProjetoFinal;

public class UsuarioGerencia extends Usuario {
    public UsuarioGerencia(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void registrarOcorrencia(SistemaOcorrencias sistema, String descricao) {
        sistema.registrarOcorrencia(this, descricao);
    }
}
