package Aula5.cemiteriodeelefantes.gestao;
import java.util.ArrayList;
import java.util.List;
class Gerente extends Empregado {
    private List<Empregado> subordinados;

    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario, departamento);
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Empregado subordinado) {
        subordinados.add(subordinado);
    }

    public void removerSubordinado(Empregado subordinado) {
        subordinados.remove(subordinado);
    }

    @Override
    public void calcularBonus() {
        super.calcularBonus();
        System.out.println("Bonus aplicado para o Gerente: extra 10% do salário base.");
    }

    public List<Empregado> getSubordinados() {
        return subordinados;
    }
}