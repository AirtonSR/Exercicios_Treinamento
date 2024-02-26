package Projeto_final.Sistema_de_Reservas_de_Hotel;

import java.time.LocalDate;

public interface Agendamento {
    void adicionarQuarto(Tipo tipo, LocalDate data);
    void RemoverQuarto(Tipo tipo, LocalDate data);
    void listaReserva();

}
