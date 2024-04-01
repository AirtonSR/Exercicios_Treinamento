package ProjetoFinal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando usuarios
        UsuarioProducao usuarioProducao = new UsuarioProducao("João", "joao@email.com");
        UsuarioGerencia usuarioGerencia = new UsuarioGerencia("Maria", "maria@email.com");

        // Criando o sistema de ocorrencias
        SistemaOcorrencias sistema = new SistemaOcorrencias();

        // Registrar ocorrencias
        usuarioProducao.registrarOcorrencia(sistema, "Problema no sistema de produção");
        usuarioGerencia.registrarOcorrencia(sistema, "Problema no sistema de gerenciamento");
        usuarioProducao.registrarOcorrencia(sistema, "Problema no sistema de produção");

        // Consultar e imprimir detalhes das ocorrencias
        sistema.imprimirOcorrencias();

    }
}