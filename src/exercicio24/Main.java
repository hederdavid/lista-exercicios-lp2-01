package exercicio24;


import exercicio23.Voo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida = 0;
        boolean isValorCorreto = false;
        Voo voo = new Voo( 1, 50);
        System.out.println(voo);

        System.out.println("SISTEMA DE GERENCIAMENTO DO VOO " + voo.getNumero());
        do {
            System.out.println("------------------------------------------------");
            System.out.println("1. CONSULTAR SE O ASSENTO ESTÁ LIVRE");
            System.out.println("2. RESERVAR ASSENTO");
            System.out.println("3. VERIFICAR TAXA DE OCUPAÇÃO DO VOO");
            System.out.println("4. ENCERRAR");
            System.out.print("Opção escolhida: ");
            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1 -> {
                    int assento = 0;
                    do {
                        try {
                            System.out.print("Insira o número do assento: ");
                            assento = scanner.nextInt();
                            voo.isAssentoLivre(assento);
                            isValorCorreto = true;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!isValorCorreto);
                    isValorCorreto = false;
                }
                case 2 -> {
                    int assento = 0;
                    do {
                        try {
                            System.out.print("Insira o número do assento a ser reservado: ");
                            assento = scanner.nextInt();
                            voo.ocuparAssento(assento);
                            isValorCorreto = true;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!isValorCorreto);
                    isValorCorreto = false;
                }
                case 3 -> {
                    voo.getTaxaOcupacao();
                }

                default -> {
                    opcaoEscolhida = 4;
                }
            }


        } while (opcaoEscolhida != 4);
        scanner.close();

//
    }
}
