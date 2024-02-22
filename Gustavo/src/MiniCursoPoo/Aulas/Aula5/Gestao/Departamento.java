package Aula5.Gestao;

import java.util.ArrayList;
import java.util.List;
public class Departamento implements Gestao {
    //----------------------------------------------------------
    //ATRIBUTOS
    public String nome;
    public Gerente gerente;
    public List<Empregado> empregados;
    //----------------------------------------------------------
    //CONSTRUTOR
    public Departamento(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    //----------------------------------------------------------
    //MÉTODOS IMPLEMENTADOS DA INTERFACE GESTAO
    @Override
    public void adicionarEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }
    @Override
    public void removerEmpregado(Empregado empregado) {
        this.empregados.remove(empregado);
    }

    //----------------------------------------------------------
    //ToString
    @Override
    public String toString() {
        return "Departamento: " + '\n' +
                "Nome: " + nome + '\n' +
                "Empregados: " + empregados +
                ' ';
    }
}

