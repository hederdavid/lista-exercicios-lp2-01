package exercicio07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo( 1);
        System.out.println(voo);
        voo.ocuparAssento(12);
        voo.ocuparAssento(1);
        voo.ocuparAssento(1);
        voo.ocuparAssento(70);
        voo.getProximoAssentoLivre();
        voo.getTotalAssentosLivres();
        voo.getTaxaOcupacao();
        Voo voo2 = (Voo) voo.clone();
        System.out.println(voo);
        voo2.ocuparAssento(12);
        voo2.ocuparAssento(1);
        voo2.ocuparAssento(1);
        voo2.ocuparAssento(70);
        voo2.getProximoAssentoLivre();
        voo2.getTotalAssentosLivres();
        voo2.getTaxaOcupacao();
    }
}
