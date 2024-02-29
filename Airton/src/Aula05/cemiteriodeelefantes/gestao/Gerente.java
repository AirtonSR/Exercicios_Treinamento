package Aula05.cemiteriodeelefantes.gestao;

import java.util.ArrayList;
import java.util.List;

public abstract class Gerente extends Empregado implements Colaborador{
    private List<Empregado> subordinados;
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.subordinados = new ArrayList<>();
    }
    @Override
    public void adicionarEmpregado(Empregado empregado) {
        subordinados.add(empregado);
    }
    @Override
    public void removerEmpregado(Empregado empregado) {
        subordinados.remove(empregado);
    }
}
