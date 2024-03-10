package exercicio17;

public class Conta implements Tributavel {
    private double saldo;
    private double saldoMinimo;
    private double taxaTributos;
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
        saldo += (deposito - calcularTributos(deposito));
    }

    public void sacar(double saque) throws Exception {
        if ((saldo - saque) < saldoMinimo) {
            throw new Exception("Saldo da conta não pode ser inferior ao saldo minimo.");
        } else {
            saldo -= (saque - calcularTributos(saque));
        }
    }

    public double calcularTributos(double valor) {
        taxaTributos = valor * 0.01;
        return valor * 0.01;
    }

    public double getTaxaTributos() {
        return taxaTributos;
    }
}
