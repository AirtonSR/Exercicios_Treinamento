package ProjetoFinal;

public class Chamados {
    private String titulo;
    private String data;

    public Chamados(String titulo, String data) {
        this.titulo = titulo;
        this.data = data;
    }

    @Override
    public String toString() {
        return  "CHAMADO: " + '\n' +
                "TITULO: " + titulo + '\n' +
                "DATA: " + data + '\n';
    }
}
