package Aula05.cemiteriodeelefantes.gestao;
import java.util.ArrayList;
import java.util.List;
public class Departamento implements Colaborador{
    public static String nome;
    private List<Empregado> empregados;
    private String departamento;
    public Departamento(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }
    @Override
    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }
    @Override
    public void removerEmpregado(Empregado empregado) {
        empregados.remove(empregado);
    }
    @Override
    public void mudarDepartamento(String novoDepartamento) {
        this.departamento = novoDepartamento;
    }
    public String getNome() {
        return nome;
    }
}
