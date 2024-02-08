package Aula5.cemiteriodeelefantes.gestao;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {
    private List<Empregado> subordinados;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Empregado empregado) {
        subordinados.add(empregado);
    }

    public void removerSubordinado(Empregado empregado) {
        subordinados.remove(empregado);
    }
}