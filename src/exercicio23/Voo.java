package exercicio23;

import java.util.Arrays;
import java.util.Date;

public class Voo {
    private final Date datahorario = new Date();
    private final int numero;
    private final Boolean[] assentos;

    public Voo(int numero, int assentos) {
        this.numero = numero;
        this.assentos = new Boolean[assentos];
        for (int i = 0; i < assentos; i++) {
            this.assentos[i] = false;
        }
    }

    @Override
    public String toString() {
        return "Voo: " + numero + "\nHorário do Voo: " + datahorario + "\nAssentos disponíveis: " + assentos.length + "\n-------------------------------------------";
    }

    @Override
    public Object clone() {
        Voo voo2 = new Voo(this.numero, this.assentos.length);
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

    public Boolean isAssentoLivre(int n) throws Exception{
        if (n < 1 || n > this.assentos.length) {
            throw new Exception("Valor inserido é menor que '1' ou maior que a quantidade disponível");
        } else {
            if (!assentos[n - 1]) {
                System.out.println("O assento " + (n) + " se encontra disponível.");
                return true;
            } else {
                System.out.println("O assento " + (n) + " se encontra indisponível.");
                System.out.println("-------------------------------------------");
                return false;
            }
        }

    }

    public void ocuparAssento(int n) throws Exception {
        if (n < 1 || n > this.assentos.length) {
            throw new Exception("Valor inválido, insira um número entre 1 e " + assentos.length);
        } else {
            if (isAssentoLivre(n)) {
                if (n == this.assentos.length) {
                    assentos[(n - 1)] = true;
                } else {
                    assentos[(n + 1)] = true;
                }
                System.out.println("Assento ocupado com sucesso!");
                System.out.println("-------------------------------------------");
            }
        }
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

    public void getTaxaOcupacao() {
        double taxaOcupacao = 0;
        double assentosOcupados = this.assentos.length - getTotalAssentosLivres();
        taxaOcupacao = (assentosOcupados * 100) / 70;
        System.out.printf("Atualmente, os assentos estão %.2f%% ocupados.%n", taxaOcupacao);
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
