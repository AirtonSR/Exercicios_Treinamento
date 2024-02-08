package Aula05.cemiteriodeelefantes.gestao;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Airton", "938321", 3000, "TI");
        Gerente gerente = new Gerente("Airton", "938321", 3000, "Gerente");
        gerente.adicionarSubordinado(empregado);
        List<Empregado> listaDeEmpregados = gerente.getEmpregado();
        System.out.println(listaDeEmpregados.toString());
        empregado.calcularBonus(3000);
        System.out.println(gerente.getEmpregado());
    }
}
