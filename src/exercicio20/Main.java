package exercicio20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoArray = 0;
        int soma = 0;
        int[] array = new int[0];
        boolean isValorCorreto = false;
        do {
            try {
                System.out.print("Informe o tamanho do array: ");
                tamanhoArray = scanner.nextInt();
                array = new int[tamanhoArray];
                isValorCorreto = true;
            } catch (NegativeArraySizeException e) {
                System.out.println("O tamanho do array não pode ser negativo!");
            } catch (InputMismatchException e) {
                System.out.println("O tamanho do array precisa ser um número inteiro!");
                scanner.next();
            }
        } while (!isValorCorreto);

        for (int i = 0; i < tamanhoArray; i++) {
            isValorCorreto = false;
            do {
                try {
                    System.out.print("Insira o " + (i + 1) + "º número: ");
                    array[i] = scanner.nextInt();
                    isValorCorreto = true;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um valor inteiro!");
                    scanner.next();
                }
            } while (!isValorCorreto);

        }

        for (int numero : array) {
            soma += numero;
        }

        System.out.println("Soma = " + soma);
    }
}
