package exercicio05;

public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial(double saldo) {
        super(saldo);
    }

    public Boolean registrarSaque(double valor) {
        double taxa;
        if (valor < this.saldo && valor > 0) {
            taxa =  (this.saldo * 0.01);
            this.saldo -= valor + taxa;
            System.out.println("Débito realizado com sucesso!");
            System.out.printf("Taxa de %.2f incluída ao saque.%n", taxa);
            return true;
        } else {
            System.out.println("O valor inserido é maior que seu saldo atual ou é nulo, débito não realizado.");
            return false;
        }
    }
}
