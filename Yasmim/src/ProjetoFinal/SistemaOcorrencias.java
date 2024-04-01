package ProjetoFinal;

import java.util.ArrayList;
import java.util.List;

public class SistemaOcorrencias {
    private List<Ocorrencia> ocorrencias;

    public SistemaOcorrencias() {
        this.ocorrencias = new ArrayList<>();
    }

    public void registrarOcorrencia(Usuario usuario, String descricao) {
        if (usuario instanceof UsuarioGerencia) {
            Ocorrencia ocorrencia = new Ocorrencia(descricao, Prioridade.ALTA, usuario);
            ocorrencias.add(ocorrencia);
        } else if (usuario instanceof UsuarioProducao) {
            Ocorrencia ocorrencia = new Ocorrencia(descricao, Prioridade.BAIXA, usuario);
            ocorrencias.add(ocorrencia);
        }
    }

    public List<Ocorrencia> consultarOcorrencias() {
        return new ArrayList<>(ocorrencias);
    }

    public void imprimirOcorrencias() {
        for (Ocorrencia ocorrencia : ocorrencias) {
            System.out.println("Descrição: " + ocorrencia.getDescricao());
            System.out.println("Prioridade: " + ocorrencia.getPrioridade());
            System.out.println();
        }
    }
}