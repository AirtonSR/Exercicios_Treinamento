package Aula4;

import org.w3c.dom.ls.LSOutput;

public class Avo {
    private String cpf;
    private String sobrenome;
    public Avo(String sobrenome, String cpf) {
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void mostrarInfo() {
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println(cpf);
    }
}
