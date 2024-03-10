package exercicio15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0, y = 0, r = 0;
        boolean isSentinela = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operação de Divisão\n");

        // entrada de dois números inteiros

        do {
            try {
                System.out.print("Informe Dividendo...: ");
                x = scanner.nextInt();
                isSentinela = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número inteiro.");
                scanner.next();
            }
        } while (!isSentinela);

        isSentinela = false;

        do {
            try {
                System.out.print("Informe Divisor.....: ");
                y = scanner.nextInt();
                isSentinela = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número inteiro.");
                scanner.next();
            }
        } while (!isSentinela);

        try {
            r = x / y; // divisão entre dois números inteiros informados;
            System.out.println("\nResultado da Divisão: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Divisor não pode ser igual a 0!");
        }

        // exibição de resultado da divisão

        scanner.close();

    }
}
