package exercicio15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0, y = 0;
        double r = 0;
        boolean isValorCorreto = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operação de Divisão\n");

        // entrada de dois números inteiros

        do {
            try {
                System.out.print("Informe Dividendo...: ");
                x = scanner.nextInt();
                isValorCorreto = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número inteiro.");
                scanner.next();
            }
        } while (!isValorCorreto);

        isValorCorreto = false;

        do {
            try {
                System.out.print("Informe Divisor.....: ");
                y = scanner.nextInt();
                if (y == 0) {
                    throw new ArithmeticException("O divisor não pode ser 0!");
                }
                isValorCorreto = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número inteiro.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } while (!isValorCorreto);

        isValorCorreto = false;

        do {
            try {
                r = (double) x / y;
                System.out.println("\nResultado da Divisão: " + r);
                isValorCorreto = true;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } while(!isValorCorreto);


        scanner.close();

    }
}
