package Desafio;
public class Main {
    public static void main(String[] args) {
        Funcionario FuncionarioDEV = new Funcionario("J", new DEV(), 4000);
        Funcionario FuncionarioDBA = new Funcionario("D", new DBA(), 2500);
        Funcionario FuncionariaTESTER = new Funcionario("A", new TESTER(), 3500);

        System.out.println(FuncionarioDEV.toString());
        System.out.println(FuncionarioDBA.toString());
        System.out.println(FuncionariaTESTER.toString());
    }
}