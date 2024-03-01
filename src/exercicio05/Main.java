package exercicio05;

public class Main {
    public static void main(String[] args) {
        ContaCorrenteEspecial conta = new ContaCorrenteEspecial(2548);
        conta.registrarSaldo(1000);
        conta.registrarSaque(1000);
        System.out.println(conta.getSaldo());
    }
}
