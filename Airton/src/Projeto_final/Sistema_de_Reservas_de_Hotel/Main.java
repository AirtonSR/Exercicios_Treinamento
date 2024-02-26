package Projeto_final.Sistema_de_Reservas_de_Hotel;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Airton", "312312", 22);
        LocalDate dataInicio = LocalDate.of(2026, 7, 1);
        hotel.adicionarQuarto(Tipo.DUPLO, dataInicio);
        hotel.listaReserva();
    }
}
