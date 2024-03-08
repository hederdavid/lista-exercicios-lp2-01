package exercicio13;

import java.util.Date;

public class Exemplar {
    protected final int numeroTombo;
    protected final String tituloObra;
    protected final String[] autoria;
    protected Boolean habilitadoExemplarEmprestimo;
    protected int quantidadeEmprestimosRegistrado = 0;
    protected int numeroReferencia = 0;

    public Exemplar(int numeroTombo, String tituloObra, String[] autoria, Boolean habilitadoExemplarEmprestimo,
                    int quantidadeEmprestimosRegistrado) {
        this.numeroTombo = numeroTombo;
        this.tituloObra = tituloObra;
        this.autoria = autoria;
        this.habilitadoExemplarEmprestimo = habilitadoExemplarEmprestimo;
        this.quantidadeEmprestimosRegistrado = quantidadeEmprestimosRegistrado;
    }

    public void adicionarEmprestimo (Date dataHora) {
        if (habilitadoExemplarEmprestimo) {
            quantidadeEmprestimosRegistrado++;
        }
    }
    public void habilitarEmprestimo() {
        habilitadoExemplarEmprestimo = true;
    }

    public void desabilitarEmprestimo() {
        habilitadoExemplarEmprestimo = false;
    }

    public void numeroReferencia(int numero) {
        this.numeroReferencia = numero;
    }

    public int getNumeroTombo() {
        return numeroTombo;
    }

    public String getTituloObra() {
        return tituloObra;
    }

    public String[] getAutoria() {
        return autoria;
    }

    public Boolean getHabilitadoExemplarEmprestimo() {
        return habilitadoExemplarEmprestimo;
    }

    public int getQuantidadeEmprestimosRegistrado() {
        return quantidadeEmprestimosRegistrado;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }
}
