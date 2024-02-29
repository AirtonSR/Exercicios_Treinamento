package ProjetoFinal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // criando Lista de ocorrencias
        List<Ocorrencia> ocorrenciasIniciais = new ArrayList<>();

        // Criando usuarios
        UsuarioProducao usuarioProducao = new UsuarioProducao("João", "joao@email.com");
        UsuarioGerencia usuarioGerencia = new UsuarioGerencia("Maria", "maria@email.com");

        // Register occurrences for users
        Ocorrencia ocorrencia1 = usuarioProducao.registrarOcorrencia("Problema no sistema de produção");
        Ocorrencia ocorrencia2 = usuarioGerencia.registrarOcorrencia("Problema no sistema de gerenciamento");
        Ocorrencia ocorrencia3 = usuarioProducao.registrarOcorrencia("Problema no sistema de produção");


        ocorrenciasIniciais.add(ocorrencia1);
        ocorrenciasIniciais.add(ocorrencia2);
        ocorrenciasIniciais.add(ocorrencia3);


        SistemaOcorrencias sistema = new SistemaOcorrencias(ocorrenciasIniciais);

        // consultar detalhes das ocorrências
        List<Ocorrencia> ocorrencias = sistema.consultarOcorrencias();

        for (Ocorrencia ocorrencia : ocorrencias) {
            System.out.println("Descrição: " + ocorrencia.getDescricao());
            System.out.println("Prioridade: " + ocorrencia.getPrioridade());
            System.out.println();
        }
    }
}