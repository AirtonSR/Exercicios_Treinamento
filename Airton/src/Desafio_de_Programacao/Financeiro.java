package Desafio_de_Programacao;
import java.util.HashMap;
public class Financeiro {
    private HashMap<Object, Object> funcionarios;
    public Financeiro() {
        this.funcionarios = new HashMap<>();
    }
    public void adicionarFuncionario(Object funcionario) {
        funcionarios.put(funcionario, funcionario);
    }
    public void calcularSalario(Object funcionario, double valor) {
        if (funcionarios.containsKey(funcionario)) {
            if (funcionario instanceof Dev) {
                Dev dev = (Dev) funcionario;
                System.out.println("Salario " + dev.calcularSalario(valor));
            } else if (funcionario instanceof Tester) {
                Tester tester = (Tester) funcionario;
                System.out.println("Salario " + tester.calcularSalario(valor));
            } else if (funcionario instanceof Dba) {
                Dba dba = (Dba) funcionario;
                System.out.println("Salario " + dba.calcularSalario(valor));
            }
        }else{
            System.out.println("Funcionário não encontrado.");
        }
    }
}