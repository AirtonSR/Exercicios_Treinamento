package Projeto_final.Sistema_de_Reservas_de_Hotel;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Hotel implements Agendamento{
    private List<Reservar> reserva;
    private Reservar reservar;
    private boolean ativo;
    private String nome;
    private String cpf;
    private int idade;
    private Tipo tipo;
    public Hotel(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        reserva = new ArrayList<>();
        this.ativo = false;
    }
    @Override
    public void adicionarQuarto(Tipo tipo, LocalDate data) {
        reserva.add(new Reservar(tipo, data));
        this.ativo = true;
    }
    @Override
    public void RemoverQuarto(Tipo tipo, LocalDate data) {
        reserva.remove(new Reservar(tipo, data));
    }
    @Override
    public void listaReserva() {
        if(ativo == false){
            System.out.println("Nenhuma reserva ainda feita");
        }else{
            for(Reservar reservar : reserva){
                System.out.println(reservar);
                System.out.println();
            }
        }
    }
}
