package exercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor;
        Conta conta = null;
        boolean isFalhaSaque = false;
        int numeroControle = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe Saldo Mínimo: ");
        valor = scanner.nextDouble();
        conta = new Conta(valor);
        
        do {
            System.out.println("---------------------------------");
            System.out.println("Selecione uma operação: ");
            System.out.println("---------------------------------");
            System.out.println("1. Atualizar saldo mínimo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Encerrar operações");
            System.out.println("---------------------------------");

            System.out.print("Opção selecionada: ");
            numeroControle = scanner.nextInt();

            switch (numeroControle) {
                case 1 -> {
                    double novoSaldoMinimo = 0;
                    System.out.print("Insira o novo saldo mínimo: ");
                    novoSaldoMinimo = scanner.nextDouble();
                    conta.setSaldoMinimo(novoSaldoMinimo);
                    System.out.println("Saldo mínimo atualizado para " + conta.getSaldoMinimo() + " com sucesso!");
                }
                case 2 -> {
                    System.out.print("\nInforme Depósito Inicial: ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Taxa de 1% aplicada ao valor depositado: " + conta.getTaxaTributos());
                }
                case 3 -> {
                    do {
                        System.out.print("\nInforme Saque após Depósito Inicial: ");
                        valor = scanner.nextDouble();
                        try {
                            conta.sacar(valor);
                            System.out.println("Taxa de 1% aplicada ao valor sacado: " + conta.getTaxaTributos());
                            System.out.println("\nSaldo Final: " + conta.getSaldo());
                            isFalhaSaque = true;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!isFalhaSaque);
                }
            }
        } while (numeroControle != 4);

        scanner.close();
    }
}
