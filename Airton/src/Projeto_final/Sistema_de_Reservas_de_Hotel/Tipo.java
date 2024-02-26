package Projeto_final.Sistema_de_Reservas_de_Hotel;

public enum Tipo {
    SINGLE(100, 20),
    DUPLO(150, 25),
    SUITE(200, 30);

    private final double precoBase;
    private final double precoPorDia;

    Tipo(double precoBase, double precoPorDia) {
        this.precoBase = precoBase;
        this.precoPorDia = precoPorDia;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

}

