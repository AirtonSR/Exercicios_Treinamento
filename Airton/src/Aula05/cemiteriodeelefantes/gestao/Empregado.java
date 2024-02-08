package org.example.lesson_05.cemiteriodeelefantes.gestao;

import java.util.List;

public class Empregado{
    public String nome;
    private String cpf;
    private Gerente gerente;
    private double salario;
    private List<Empregado> empregados;
    public String departamentos;
    private boolean estaDeFerias;

    public Empregado(String nome, String cpf, double salario, String departamento){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.departamentos = departamento;
        this.estaDeFerias = false;
    }
    public void mudarDepartamento(String novoDepartamento) {
        this.nome = novoDepartamento;
    }
    public void calcularBonus(double salario) {
        salario  = salario * 1.1;
        System.out.printf("Salario com bonus: %.2f\n", salario);
    }
    public void iniciarFerias() {
        this.estaDeFerias = true;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", departamentos='" + departamentos + '\'' +
                ", estaDeFerias=" + estaDeFerias +
                '}';
    }
}
