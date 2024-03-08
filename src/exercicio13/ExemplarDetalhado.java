package exercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExemplarDetalhado extends Exemplar {
    public ExemplarDetalhado (int numeroTombo, String tituloObra, String[] autoria, Boolean habilitadoExemplarEmprestimo,
                              int quantidadeEmprestimosRegistrado) {
        super(numeroTombo, tituloObra, autoria, habilitadoExemplarEmprestimo, quantidadeEmprestimosRegistrado);
    }

    public void adicionarEmprestimo(Date dataHora) {
        if (habilitadoExemplarEmprestimo) {
            quantidadeEmprestimosRegistrado++;
            System.out.println();
            System.out.println("Empréstimo realizado. " + dataHora);
        }
    }
}
