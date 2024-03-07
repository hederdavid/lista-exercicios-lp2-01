package exercicio11;

public class Exemplar {
    private int numeroTombo;
    private String tituloObra;
    private String[] autoria;
    private Boolean habilitadoExemplarEmprestimo;
    private int quantidadeEmprestimosRegistrado = 0;

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






}
