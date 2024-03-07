package exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        int funcionarioSelecionado = 0;
        int horasAcrescimo = 0;
        Funcionario funcionario1 = new Funcionario("Heder", "Moreira David", 50,
                40);
        Funcionario funcionario2 = new Funcionario("João", "Silva", 40,
                25.50);
        Funcionario funcionario3 = new Funcionario("Maria", "Souza", 35,
                20.00);
        Funcionario funcionario4 = new Funcionario("Carlos", "Ferreira", 38,
                22.50);
        Funcionario funcionario5 = new Funcionario("Ana", "Pereira", 42,
                18.75);
        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite 1 para acrescentar horas de trabalho;");
            System.out.println("Digite 2 para exibir o salário líquido dos funcionários;");
            System.out.println("Digite 3 para encerrar.");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Selecione o funcionario: ");
                System.out.print("Digite 1 para funcionario1, 2 para funcionario2, 3 para funcionario3, 4 para" +
                        " funcionario4 e 5 para funcionario5: ");
                funcionarioSelecionado = scanner.nextInt();
                System.out.print("Digite as horas de trabalho para o acréscrimo: ");
                horasAcrescimo = scanner.nextInt();
                scanner.close();
                switch (funcionarioSelecionado) {
                    case 1:
                        System.out.println(funcionario1.getPrimeiroNome() + " " + funcionario1.getSobrenome());
                        funcionario1.adicionarCargaHoraria(horasAcrescimo);
                        break;
                    case 2:
                        System.out.println(funcionario2.getPrimeiroNome() + " " + funcionario2.getSobrenome());
                        funcionario2.adicionarCargaHoraria(horasAcrescimo);
                        break;
                    case 3:
                        System.out.println(funcionario3.getPrimeiroNome() + " " + funcionario3.getSobrenome());
                        funcionario3.adicionarCargaHoraria(horasAcrescimo);
                        break;
                    case 4:
                        System.out.println(funcionario4.getPrimeiroNome() + " " + funcionario4.getSobrenome());
                        funcionario4.adicionarCargaHoraria(horasAcrescimo);
                        break;
                    case 5:
                        System.out.println(funcionario5.getPrimeiroNome() + " " + funcionario5.getSobrenome());
                        funcionario5.adicionarCargaHoraria(horasAcrescimo);
                        break;
                }
            } else if (opcao == 2) {
                funcionario1.getSalarioLiquido();
                funcionario2.getSalarioLiquido();
                funcionario3.getSalarioLiquido();
                funcionario4.getSalarioLiquido();
                funcionario5.getSalarioLiquido();
            } else if (opcao == 3) {
                System.out.println("Sistema finalizado.");
            } else {
                System.out.println("Operação invalida, digite um número correto.");
            }
        } while (opcao != 3);
    }
}
