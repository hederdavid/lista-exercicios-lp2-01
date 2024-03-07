package exercicio10;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Heder", "Moreira David", 50,
                40);
        Funcionario funcionario2 = new Funcionario("João", "Silva",  40,
                25.50);
        Funcionario funcionario3 = new Funcionario("Maria", "Souza",  35,
                20.00);
        Funcionario funcionario4 = new Funcionario("Carlos", "Ferreira", 38,
                22.50);
        Funcionario funcionario5 = new Funcionario("Ana", "Pereira",  42,
                18.75);
        funcionario3.adicionarCargaHoraria(5);
        funcionario1.getSalarioLiquido();
        funcionario2.getSalarioLiquido();
        funcionario3.getSalarioLiquido();
        funcionario4.getSalarioLiquido();
        funcionario5.getSalarioLiquido();


    }
}
