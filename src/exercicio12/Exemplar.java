package exercicio12;

public class Exemplar {
    private int numeroTombo;
    private final String tituloObra;
    private final String[] autoria;
    private Boolean habilitadoExemplarEmprestimo;
    private int quantidadeEmprestimosRegistrado = 0;
    private int numeroReferencia = 0;

    public Exemplar(String tituloObra, String[] autoria, Boolean habilitadoExemplarEmprestimo,
                    int quantidadeEmprestimosRegistrado) {
        this.tituloObra = tituloObra;
        this.autoria = autoria;
        this.habilitadoExemplarEmprestimo = habilitadoExemplarEmprestimo;
        this.quantidadeEmprestimosRegistrado = quantidadeEmprestimosRegistrado;
    }

    public void adicionarEmprestimo () {
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
