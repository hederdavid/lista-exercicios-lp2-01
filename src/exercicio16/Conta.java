package exercicio16;

public class Conta {
    private double saldo;
    private double saldoMinimo;
    public Conta(double saldoMinimo) {
        this.saldo = 0;
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) throws Exception {
        if ((saldo -= saque) < saldoMinimo) {
            saldo += saque;
            throw new Exception("Saldo da conta não pode ser inferior ao saldo minimo.");
        }
    }
}
