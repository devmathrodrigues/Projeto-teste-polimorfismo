package jacacore.dominio;

public class Celular extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.60;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double taxaDeImposto() {
        System.out.println("Calculando imposto do celular");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
