package Desafio;
    import java.util.Scanner;

    public class Salario {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número de funcionários: ");
            int numFuncionarios = scanner.nextInt();

            Funcionario[] funcionarios = new Funcionario[numFuncionarios];

            for (int i = 0; i < numFuncionarios; i++) {
                System.out.println("Funcionário " + (i + 1));
                System.out.print("Nome: ");
                String nome = scanner.next();

                System.out.print("Categoria de Desafio.Cargo (DEV, DBA, TESTER): ");
                String categoria = scanner.next();
                Cargo categoriaCargo = Cargo.valueOf(categoria);

                System.out.print("Salário Bruto: ");
                double salarioBruto = scanner.nextDouble();

                funcionarios[i] = new Funcionario(nome, categoriaCargo, salarioBruto);
            }

            System.out.println("Salário Líquido dos Funcionários:");

            for (Funcionario funcionario : funcionarios) {
                double salarioLiquido = funcionario.calcularSalarioLiquido();
                System.out.println(funcionario.getNome() + ": R$" + salarioLiquido);
            }

            scanner.close();
        }
    }

