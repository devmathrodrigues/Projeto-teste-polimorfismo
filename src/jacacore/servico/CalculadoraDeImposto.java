package jacacore.servico;
import jacacore.dominio.Produto;


public class CalculadoraDeImposto {

    // O método CalculaImposto recebe um objeto do tipo Produto como parâmetro, permitindo acessar os dados de Produto
    // atraves da variável de referência produto
    public static void CalculaImposto(Produto produto){
        System.out.println("Relatório do valor a ser pago em imposto");
        double imposto = produto.taxaDeImposto();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " +produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
