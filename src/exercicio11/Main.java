package exercicio11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida;
        Exemplar exemplar1 = new Exemplar("Aventuras na Cidade", new String[]{"José Silva", "Maria Oliveira"},
                true, 10);
        Exemplar exemplar2 = new Exemplar("O Mistério do Universo", new String[]{"Carlos Souza", "Ana Santos"},
                true, 15);
        Exemplar exemplar3 = new Exemplar("Jornada ao Desconhecido", new String[]{"Fernanda Lima", "Pedro Almeida"},
                false, 5);
        Exemplar exemplar4 = new Exemplar("Segredos do Passado", new String[]{"Paulo Rocha", "Juliana Costa"},
                true, 8);
        Exemplar exemplar5 = new Exemplar("O Enigma das Estrelas", new String[]{"Camila Oliveira", "Rafael Santos"},
                false, 12);
        Exemplar exemplar6 = new Exemplar("A Descoberta do Novo Mundo", new String[]{"Mariana Silva", "Daniel Costa"},
                true, 20);
        Exemplar[] exemplares = {exemplar1, exemplar2, exemplar3, exemplar4, exemplar5, exemplar6};
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ Bem-vindo ao Sistema de Biblioteca!  ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ Escolha uma opção:                   ║");
        System.out.println("║ 1. Habilitar empréstimo              ║");
        System.out.println("║ 2. Desabilitar empréstimo            ║");
        System.out.println("║ 4. Registrar novo empréstimo         ║");
        System.out.println("║ 5. Exibir total de empréstimos       ║");
        System.out.println("║ 6. Exemplar de maior empréstimos     ║");
        System.out.println("║ 7. Sair                              ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print("Opção escolhida: ");

        opcaoEscolhida = scanner.nextInt();

        if (opcaoEscolhida == 1) {
            System.out.println("╔════════════════════════════════════════════════════════╗");
            System.out.println("║ Exemplares disponíveis para habilitação de empréstimo: ║");

            for (Exemplar exemplar : exemplares) {
                if (!exemplar.getHabilitadoExemplarEmprestimo()) {
                    System.out.println("╠════════════════════════════════════════════════════════╣");
                    System.out.println("║ Título: " + exemplar.getTituloObra());
                    System.out.println("║ Autores: ");
                    for (String autor : exemplar.getAutoria()) {
                        System.out.println("║   - " + autor);
                    }
                }
            }

            System.out.println("╚════════════════════════════════════════════════════════╝");
        } else if (opcaoEscolhida == 2) {

        }
    }
}
