package Projeto_final.Sistema_de_Reservas_de_Hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class Reservar {
    private Tipo tipo;
    private List<Object> reserva;
    public LocalDate dataInicio;
    private double precoTotal;
    private Hotel hotel;
    public Reservar(Tipo tipo, LocalDate data) {
        this.tipo = tipo;
        this.dataInicio = data;
        reserva = new ArrayList<>();

    }
    public double calcularPreco() {
        long diasAteInicio = LocalDate.now().until(dataInicio, ChronoUnit.DAYS);
        double precoBase = tipo.getPrecoBase();
        double precoPorDia = tipo.getPrecoPorDia();
        double precoTotal = precoBase + (precoPorDia * diasAteInicio);

        if (diasAteInicio >= 150 && diasAteInicio <= 180) {
            precoTotal *= 0.9;
        }
        return precoTotal;
    }
    @Override
    public String toString() {
        return "Reserva{" +
                "Tipo: " + tipo +
                ", DataInicio: " + dataInicio +
                ", PrecoTotal: " + calcularPreco() +
                '}';
    }
}
