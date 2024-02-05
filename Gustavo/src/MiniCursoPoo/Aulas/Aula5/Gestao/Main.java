package Aula5.Gestao;

public class Main {
    public void main(String[] args) {
        Gerente claudio = new Gerente("claudio", "1230", 1000);
        //Crinando gerente

        Empregado jose = new Empregado("aaaaa", "0321", 500);
        //Criando empregado

        claudio.adicionarSubordinado(jose);
        //Adicionando empregado(jose) como subordinado do gerente(claudio)

        Departamento subordinados = new Departamento("Subordinados");
        //Criando departamento subordinados

        subordinados.adicionarEmpregado(jose);
        //Adicionando jose no departamento subordinados

        Departamento gerencia = new Departamento("Gerencia");

        System.out.println(subordinados.toString());
    }

}
