package exercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor;
        Conta conta = null;
        boolean isFalhaSaque = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe Saldo Mínimo: ");
        valor = scanner.nextDouble();
        conta = new Conta(valor);

        System.out.print("\nInforme Depósito Inicial: ");
        valor = scanner.nextDouble();
        conta.depositar(valor);

        do {
            System.out.print("\nInforme Saque após Depósito Inicial: ");
            valor = scanner.nextDouble();
            try {
                conta.sacar(valor);
                System.out.println("\nSaldo Final: " + conta.getSaldo());
                isFalhaSaque = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!isFalhaSaque);

        scanner.close();
    }
}
