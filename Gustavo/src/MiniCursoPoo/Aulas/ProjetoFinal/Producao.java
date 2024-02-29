package ProjetoFinal;

import java.util.ArrayList;
import java.util.List;

public class Producao implements Interface {
    private Chamados chamado;
    private String setor = "Produção";
    private List<Chamados> chamados;

    public Producao(String setor) {
        this.chamados = new ArrayList<>();
        this.setor = setor;
    }

        public void abrirChamado(Chamados chamado) {
            chamados.add(chamado);
         }
        public void fecharChamado (Chamados chamado) {
            chamados.remove(chamado);
        }
    @Override
    public String toString() {
        return "------------------------" + '\n' +
               "Setor: " + setor + '\n' +
               "------------------------" + '\n' +
               chamados;
            }
        }