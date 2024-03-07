package exercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroRef = 0;
        int opcaoEscolhida;
        Exemplar exemplar1 = new Exemplar("Aventuras na Cidade", new String[]{"José Silva", "Maria Oliveira"},
                false, 10);
        Exemplar exemplar2 = new Exemplar("O Mistério do Universo", new String[]{"Carlos Souza", "Ana Santos"},
                false, 15);
        Exemplar exemplar3 = new Exemplar("Jornada ao Desconhecido", new String[]{"Fernanda Lima", "Pedro Almeida"},
                false, 5);
        Exemplar exemplar4 = new Exemplar("Segredos do Passado", new String[]{"Paulo Rocha", "Juliana Costa"},
                true, 0);
        Exemplar exemplar5 = new Exemplar("O Enigma das Estrelas", new String[]{"Camila Oliveira", "Rafael Santos"},
                false, 12);
        Exemplar exemplar6 = new Exemplar("A Descoberta do Novo Mundo", new String[]{"Mariana Silva", "Daniel Costa"},
                true, 20);
        do {
            Exemplar[] exemplares = {exemplar1, exemplar2, exemplar3, exemplar4, exemplar5, exemplar6};
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║ Bem-vindo ao Sistema de Biblioteca!  ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ Escolha uma opção:                   ║");
            System.out.println("║ 1. Habilitar empréstimo              ║");
            System.out.println("║ 2. Desabilitar empréstimo            ║");
            System.out.println("║ 3. Registrar novo empréstimo         ║");
            System.out.println("║ 4. Exibir total de empréstimos       ║");
            System.out.println("║ 5. Exemplar de maior empréstimos     ║");
            System.out.println("║ 6. Sair                              ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Opção escolhida: ");

            opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                int opcao = 0;
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║ Exemplares disponíveis para habilitação de empréstimo: ║");

                for (Exemplar exemplar : exemplares) {
                    if (!exemplar.getHabilitadoExemplarEmprestimo()) {
                        numeroRef++;
                        exemplar.numeroReferencia(numeroRef);
                        System.out.println("╠════════════════════════════════════════════════════════╣");
                        System.out.println("║ Título: " + exemplar.getTituloObra() + " (" + numeroRef + ")");
                        System.out.println("║ Autores: ");
                        for (String autor : exemplar.getAutoria()) {
                            System.out.println("║   - " + autor);
                        }
                    }
                }
                if (numeroRef == 0) {
                    System.out.println("║ No momento, todos estão disponíveis                    ║");
                }
                System.out.println("╚════════════════════════════════════════════════════════╝");
                System.out.print("Opção escolhida: ");
                opcao = scanner.nextInt();
                numeroRef = 0;

                if (opcao > 0) {
                    for (Exemplar exemplar : exemplares) {
                        if (opcao == exemplar.getNumeroReferencia()) {
                            exemplar.habilitarEmprestimo();
                            System.out.println("Exemplar '" + exemplar.getTituloObra() + "' habilitado para empréstimo.");
                            exemplar.numeroReferencia(0);
                        }
                    }

                }

            } else if (opcaoEscolhida == 2) {
                int opcao = 0;
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║ Exemplares habilitados para empréstimos:               ║");

                for (Exemplar exemplar : exemplares) {
                    if (exemplar.getHabilitadoExemplarEmprestimo()) {
                        numeroRef++;
                        exemplar.numeroReferencia(numeroRef);
                        System.out.println("╠════════════════════════════════════════════════════════╣");
                        System.out.println("║ Título: " + exemplar.getTituloObra() + " (" + numeroRef + ")");
                        System.out.println("║ Autores: ");
                        for (String autor : exemplar.getAutoria()) {
                            System.out.println("║   - " + autor);
                        }
                    }
                }
                if (numeroRef == 0) {
                    System.out.println("║ No momento, todos os livros estão indisponíveis        ║");
                }
                System.out.println("╚════════════════════════════════════════════════════════╝");
                System.out.println();
                System.out.print("Opção escolhida: ");
                opcao = scanner.nextInt();
                numeroRef = 0;

                if (opcao > 0) {
                    for (Exemplar exemplar : exemplares) {
                        if (opcao == exemplar.getNumeroReferencia()) {
                            exemplar.desabilitarEmprestimo();
                            System.out.println("Exemplar '" + exemplar.getTituloObra() + "' desabilitado para empréstimo.");
                            exemplar.numeroReferencia(0);
                        }
                    }

                }

            } else if (opcaoEscolhida == 3) {
                int opcao = 0;
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║ Exemplares habilitados para empréstimos:               ║");

                for (Exemplar exemplar : exemplares) {
                    if (exemplar.getHabilitadoExemplarEmprestimo()) {
                        numeroRef++;
                        exemplar.numeroReferencia(numeroRef);
                        System.out.println("╠════════════════════════════════════════════════════════╣");
                        System.out.println("║ Título: " + exemplar.getTituloObra() + " (" + numeroRef + ")");
                        System.out.println("║ Autores: ");
                        for (String autor : exemplar.getAutoria()) {
                            System.out.println("║   - " + autor);
                        }
                    }
                }
                if (numeroRef == 0) {
                    System.out.println("║ No momento, todos os livros estão indisponíveis        ║");
                }
                System.out.println("╚════════════════════════════════════════════════════════╝");
                System.out.println();
                System.out.print("Opção escolhida: ");
                opcao = scanner.nextInt();
                numeroRef = 0;

                if (opcao > 0) {
                    for (Exemplar exemplar : exemplares) {
                        if (opcao == exemplar.getNumeroReferencia()) {
                            exemplar.adicionarEmprestimo();
                            System.out.println("Exemplar '" + exemplar.getTituloObra() + "' emprestado.");
                            System.out.println("Total de empréstimos da obra até o momento: " + exemplar.getQuantidadeEmprestimosRegistrado());
                            exemplar.numeroReferencia(0);
                        }
                    }

                }

            } else if (opcaoEscolhida == 4) {
                int totalEmprestimos = 0;
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║ Total de empréstimos:                                  ║");

                for (Exemplar exemplar : exemplares) {
                    totalEmprestimos += exemplar.getQuantidadeEmprestimosRegistrado();
                        System.out.println("╠════════════════════════════════════════════════════════╣");
                        System.out.println("║ Título: " + exemplar.getTituloObra());
                        System.out.println("║ Autores: ");
                        System.out.println("║ Empréstimos: " + exemplar.getQuantidadeEmprestimosRegistrado());
                        for (String autor : exemplar.getAutoria()) {
                            System.out.println("║   - " + autor);
                        }
                }
                System.out.println("╠════════════════════════════════════════════════════════╣");
                System.out.println("║ Total de empréstimos: " + totalEmprestimos);
                System.out.println("╚════════════════════════════════════════════════════════╝");
                System.out.println();

            } else if (opcaoEscolhida == 5) {
                Exemplar[] exemplarMaiorEmprestimo = new Exemplar[5];
                int quantidadeMaiorEmprestimo = 0;
                System.out.println("╔════════════════════════════════════════════════════════╗");
                System.out.println("║ Livro(s) com maior quantidade de empréstimos           ║");
                for (Exemplar exemplar : exemplares) {
                    if (exemplar.getQuantidadeEmprestimosRegistrado() > quantidadeMaiorEmprestimo) {
                        quantidadeMaiorEmprestimo = exemplar.getQuantidadeEmprestimosRegistrado();
                        exemplarMaiorEmprestimo[0] = exemplar;
                    }
                }
                for (int i = 0; i < exemplares.length; i++) {
                    if (quantidadeMaiorEmprestimo == exemplares[i].getQuantidadeEmprestimosRegistrado()) {
                        exemplarMaiorEmprestimo[i] = exemplares[i];
                    }
                }

            }

        } while (opcaoEscolhida != 6);
    }
}
