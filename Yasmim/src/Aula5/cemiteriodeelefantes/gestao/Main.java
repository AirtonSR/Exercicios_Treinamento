package Aula5.cemiteriodeelefantes.gestao;
import java.util.List;
public class Main {
        public static void main(String[] args) {
            Empregado empregado = new Empregado("KL", "938321", 1000, "DEV");
            Gerente gerente = new Gerente("JU", "658479890", 4000, "Gerente");

            gerente.adicionarSubordinado(empregado);

            System.out.println("Lista de subordinados:");
            for (Empregado subordinado : gerente.getSubordinados()) {
                System.out.println(subordinado);
            }
            empregado.calcularBonus();
            gerente.calcularBonus();
        }
    }
