package Aula5.cemiteriodeelefantes.gestao;
import java.util.ArrayList;
import java.util.List;
public class Departamento {
    private String nome;
    private Gerente gerente;
    private List<Empregado> empregados;
    public Departamento(String nome, Gerente gerente) {
        this.nome = nome;
        this.gerente = gerente;
        this.empregados = new ArrayList<>();
    }
    public void adicionarEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
        gerente.adicionarSubordinado(empregado);
    }
    public void removerEmpregado(Empregado empregado) {
        this.empregados.remove(empregado);
        gerente.removerSubordinado(empregado);
    }
}
