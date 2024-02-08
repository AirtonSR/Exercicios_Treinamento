package org.example.lesson_05.cemiteriodeelefantes.gestao;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado{
    private List<Empregado> empregado;
    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario, departamento);
        this.empregado = new ArrayList<>();
    }
    protected void adicionarSubordinado(Empregado subordinado) {
        empregado.add(subordinado);
    }
    private void removerSubordinado(Empregado subordinado) {
        this.empregado.remove(subordinado);
    }

    private void adicionarEmpregado(Empregado empregado) {
        this.empregado.add(empregado);
    }

    private void removerEmpregado(Empregado empregado) {
        this.empregado.remove(empregado);
    }
    public List<Empregado> getEmpregado() {
        return empregado;
    }
}
