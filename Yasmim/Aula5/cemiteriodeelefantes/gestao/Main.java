package org.example.lesson_05.cemiteriodeelefantes.gestao;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jane", "65876846836", 5000);

        Empregado empregado1 = new Empregado("João", "685783685", 1300);
        Empregado empregado2 = new Empregado("Maria", "685783685", 1300);
        Empregado empregado3 = new Empregado("Pedro", "685783685", 1300);

        gerente.adicionarSubordinado(empregado1);
        gerente.adicionarSubordinado(empregado2);
        gerente.adicionarSubordinado(empregado3);

        Departamento departamento = new Departamento("Dev", gerente);
        departamento.adicionarEmpregado(empregado1);
        departamento.adicionarEmpregado(empregado2);

        Departamento departamento2 = new Departamento("RH", gerente);
        departamento2.adicionarEmpregado(empregado3);


    }
}
