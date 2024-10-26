package jacacore.test;

import jacacore.dominio.Celular;
import jacacore.dominio.Televisao;
import jacacore.dominio.Videogame;
import jacacore.servico.CalculadoraDeImposto;

public class testDaAplicacao {
    public static void main(String[] args) {
        Celular celular = new Celular("Iphone 15", 8000);

        Televisao televisao = new Televisao("Samsung 55", 3200);
        Videogame videogame = new Videogame("PS5 Pro", 5000);

        CalculadoraDeImposto.CalculaImposto(videogame);
        System.out.println("-------------------");
        CalculadoraDeImposto.CalculaImposto(televisao);
        System.out.println("-------------------");
        CalculadoraDeImposto.CalculaImposto(celular);
    }
}
