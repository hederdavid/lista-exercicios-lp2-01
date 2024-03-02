package exercicio08;

import java.util.Arrays;
import java.util.Date;

public class Voo {
    protected final Date datahorario = new Date();
    protected int numero;
    protected Boolean[] assentos = new Boolean[70];

    {
        Arrays.fill(assentos, false); //preenche todos os indices do array "assentos" com o valor false(desocupado)
    }

    public Voo(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Voo: " + numero + "\nHorário do Voo: " + datahorario + "\nAssentos disponíveis: " + assentos.length + "\n-------------------------------------------";
    }

    @Override
    public Object clone() {
        Voo voo2 = new Voo(this.numero);
        System.arraycopy(this.assentos, 0, voo2.assentos, 0, assentos.length);
        return voo2;

    }

    public void getProximoAssentoLivre() {
        System.out.println("Assentos disponíveis: ");
        for (int i = 0; i < assentos.length; i++) {
            if (!assentos[i]) {
                switch (i) {
                    case 9:
                        System.out.println(i + 1);
                        break;
                    case 19:
                        System.out.println(i + 1);
                        break;
                    case 29:
                        System.out.println(i + 1);
                        break;
                    case 39:
                        System.out.println(i + 1);
                        break;
                    case 49:
                        System.out.println(i + 1);
                        break;
                    case 59:
                        System.out.println(i + 1);
                        break;
                    case 69:
                        System.out.println(i + 1);
                        break;
                    default:
                        System.out.print(i + 1 + " ");
                        break;
                }
            }
        }
        System.out.println();
    }

    public Boolean isAssentoLivre(int n) {
        if (!assentos[n]) {
            System.out.println("O assento " + (n + 1) + " se encontra disponível.");
            return true;
        } else {
            System.out.println("O assento " + (n + 1) + " se encontra indisponível.");
            System.out.println("-------------------------------------------");
            return false;
        }
    }

    public Boolean ocuparAssento(int n) {
        int indiceCorreto = n - 1;
        if (indiceCorreto < 0 || indiceCorreto > 69) {
            System.out.println("O assento inserido não existe, insira um valor entre 1 e 70.");
            return false;
        } else {
            if (isAssentoLivre(indiceCorreto)) {
                assentos[indiceCorreto] = true;
                System.out.println("Assento ocupado com sucesso!");
                System.out.println("-------------------------------------------");
                return true;
            }
        }
        return false;
    }

    public int getTotalAssentosLivres() {
        int assentosLivres = 0;
        for (Boolean assento : assentos) {
            if (!assento) {
                assentosLivres++;
            }
        }
        System.out.println("Atualmente, o voo possui " + assentosLivres + " assentos disponíveis");
        return assentosLivres;
    }

    public double getTaxaOcupacao() {
        double taxaOcupacao = 0;
        double assentosOcupados = 70 - getTotalAssentosLivres();
        taxaOcupacao = (assentosOcupados * 100) / 70;
        System.out.printf("Atualmente, os assentos estão %.2f%% ocupados.%n", taxaOcupacao);
        return taxaOcupacao;
    }

    public Date getDatahorario() {
        return datahorario;
    }

    public int getNumero() {
        return numero;
    }

    public String getAssentos() {
        return Arrays.toString(assentos);
    }
}
