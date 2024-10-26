package jacacore.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.47;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double taxaDeImposto() {
        System.out.println("Calculando imposto da televisao");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
