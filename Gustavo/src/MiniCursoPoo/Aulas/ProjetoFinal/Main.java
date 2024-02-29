package ProjetoFinal;

public class Main {
    public static void main(String[] args) {
//GESTÃO
    Gestao gestao = new Gestao("Gestão");
    Chamados chamado = new Chamados("Teste de led", "27/02/2024");
    Chamados chamado0 = new Chamados("Máquina com defeito", "30/01/2024");
    gestao.abrirChamado(chamado);
    gestao.abrirChamado(chamado0);

//PRODUÇÃO
    Producao producao = new Producao("Produção");
    Chamados chamado01 = new Chamados("Lacre com defeito", "15/02/2024");
    Chamados chamado02 = new Chamados("Falha no sistema", "03/02/2024");
    producao.abrirChamado(chamado01);
    producao.abrirChamado(chamado02);

    gestao.fecharChamado(chamado);
    producao.fecharChamado(chamado01);

    System.out.println(gestao);
    System.out.println(producao);
    }
}
