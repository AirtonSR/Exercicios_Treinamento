package Aula5.Gestao;

public class main {
    public static void main(String[] args) {
    //--------------------------------------------------------------------
    //CRIANDO DEPARTAMENTO E GERENTE A PARTIR DO CLASSE
    Departamento gerencia = new Departamento("Gerencia");
    Gerente gerente = new Gerente("Paulo", "123.456.789-00", 5000, gerencia);

    //--------------------------------------------------------------------
    //CRIANDO EMPREGADO E ADICIONANDO NO DEPARTAMENTO DE GERENCIA.
    Empregado empregado = new Empregado("Joao", "123.456.789-00", 5000);
    gerencia.adicionarEmpregado(empregado);

    //--------------------------------------------------------------------
    //CRINADO DEPARTAMENTO FUNCIONARIO E ADICIONANDO FUNCIONARIOS
    Departamento funcionario = new Departamento("funcionarios");

    //--------------------------------------------------------------------
    // CRIANDO EMPREGADOS E ADICIONANDO EMPREGADOS NO DEPARTAMENTO FUNCIONARIOS
    Empregado empregado1 = new Empregado("Maria", "987.654.321-00", 1200);
    funcionario.adicionarEmpregado(empregado1);

    //--------------------------------------------------------------------
    //TO STRING DOS OBJETOS CRIADOS.
    System.out.println(gerencia);
    System.out.println(funcionario);
    System.out.println(gerente);
    }
}
