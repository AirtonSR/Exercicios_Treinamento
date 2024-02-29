package ProjetoFinal;

import java.util.ArrayList;
import java.util.List;

public class SistemaOcorrencias {
    private List<Ocorrencia> ocorrencias;

    public SistemaOcorrencias(List<Ocorrencia> ocorrencias) {
        if (ocorrencias != null) {
            this.ocorrencias = ocorrencias;
        } else {
            this.ocorrencias = new ArrayList<>();
        }
    }

    public void adicionarOcorrencia(Ocorrencia ocorrencia) {
        if (ocorrencia != null) { // Verifica se a ocorrencia não é nula
            if (ocorrencia.getPrioridade() == Prioridade.ALTA) {
                ocorrencias.add(0, ocorrencia);
            } else {
                ocorrencias.add(ocorrencia);
            }
        } else {
            System.out.println("Ocorrência é nula. Não pode ser adicionada à lista.");
        }
    }

    public List<Ocorrencia> consultarOcorrencias() {
        return new ArrayList<>(ocorrencias);
    }
}