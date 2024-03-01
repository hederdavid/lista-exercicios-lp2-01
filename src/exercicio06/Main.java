package exercicio06;

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

    }
}
