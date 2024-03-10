package exercicio22;

import exercicio21.DataIncorretaException;
import exercicio21.Date;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = 0, mes = 0, ano = 0;
        Date date = null;
        boolean isNumeroCorreto = false;
        do {
            try {
                do {
                    try {
                        System.out.print("Insira a data: ");
                        data = scanner.nextInt();
                        isNumeroCorreto = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Insira um número inteiro!");
                        scanner.next();
                    }
                } while (!isNumeroCorreto);

                isNumeroCorreto = false;

                do {
                    try {
                        System.out.print("Insira o mês: ");
                        mes = scanner.nextInt();
                        isNumeroCorreto = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Insira um número inteiro!");
                        scanner.next();
                    }
                } while (!isNumeroCorreto);

                isNumeroCorreto = false;

                do {
                    try {
                        System.out.print("Insira o ano: ");
                        ano = scanner.nextInt();
                        isNumeroCorreto = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Insira um número inteiro!");
                        scanner.next();
                    }
                } while (!isNumeroCorreto);

                isNumeroCorreto = false;
                date = new Date(data, mes, ano);
                isNumeroCorreto = true;
            } catch (DataIncorretaException e) {
                System.out.println(e.getMessage());
            }
        } while (!isNumeroCorreto);

        System.out.println(date.showDate());
        System.out.println(date.getDiasTerminoAno());
        scanner.close();
    }
}