package jacacore.dominio;

public class Videogame extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.63;

    public Videogame(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double taxaDeImposto() {
        System.out.println("Calculando imposto do videogame");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}