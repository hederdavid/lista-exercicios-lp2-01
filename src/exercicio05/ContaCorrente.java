package exercicio05;

public class ContaCorrente {
    protected double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public Boolean registrarSaldo(double saldo) {
        if(saldo > 0) {
            this.saldo += saldo;
            System.out.println("Depósito realizado com sucesso!");
            return true;
        } else {
            System.out.println("Valor negativo ou nulo, depósito não realizado");
            return false;
        }
    }

    public Boolean registrarSaque(double valor) {
        double taxa;
        if(valor < this.saldo && valor > 0) {
            taxa =  (this.saldo * 0.05);
            this.saldo -= valor + taxa;
            System.out.println("Débito realizado com sucesso!");
            System.out.println("Taxa de " + taxa + " incluida ao saque.");
            return true;
        } else {
            System.out.println("O valor inserido é maior que seu saldo atual ou é nulo, débito não realizado.");
            return false;
        }
    }

    public double getSaldo() {
        System.out.print("Saldo atual: ");
        return this.saldo;
    }
}
