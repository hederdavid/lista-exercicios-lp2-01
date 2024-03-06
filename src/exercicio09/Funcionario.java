package exercicio09;

public class Funcionario {
    private final String primeiroNome;
    private final String sobrenome;
    private double horasTrabalhadasMes = 0;
    private final double valorHoraTrabalhada;

    public Funcionario(String primeiroNome, String sobrenome, double horasTrabalhadasMes, double valorHoraTrabalhada) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadasMes = horasTrabalhadasMes;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public void adicionarCargaHoraria(int h) {
        this.horasTrabalhadasMes += h;
        System.out.println(h + " hora(s) de trabalho adicionado com sucesso.");
        System.out.println("Atual valor de horas trabalhadas no mês: " + this.horasTrabalhadasMes);
    }

    public double taxa1(double valor) {
        return valor * 0.075;
    }

    public double taxa2(double valor) {
        return valor * 0.09;
    }

    public double taxa3(double valor) {
        return valor * 0.12;
    }

    public double taxa4(double valor) {
        return valor * 0.14;
    }

    public double getSalarioLiquido() {
        double salario = horasTrabalhadasMes * valorHoraTrabalhada;
        double salarioLiquido = 0;
        double restoSalario = 0;
        if (salario < 1212.01) {
            System.out.println("Taxa de " + taxa1(salario) + " aplicada.");
            salarioLiquido = salario - taxa1(salario);
            System.out.println("Salario líquido: " + salarioLiquido);
            return salarioLiquido;
        } else if (salario > 1212.0 && salario < 2427.36) {
            restoSalario = salario - 1212;
            System.out.println("Taxa de " + (taxa1(1212) + taxa2(restoSalario))+ " aplicada.");
            salarioLiquido = salario - (taxa2(restoSalario) + taxa1(1212));
            System.out.println("Salario líquido: " + salarioLiquido);
        } else if (salario > 2427.36 && salario < 3641.04) {
            salarioLiquido = salario - taxa1(1212.0);
            restoSalario = salario - 1212.0;
            if (restoSalario < 2427.36) {
                System.out.println("Taxa de " + (taxa1(1212.0) + taxa2(restoSalario)) + " aplicada.");
                salarioLiquido -= taxa2(restoSalario);
                System.out.println("Salario líquido: " + salarioLiquido);
            } else {
                salarioLiquido -= taxa2(2427.35);
                restoSalario = salario - (2427.35 + 1212);
                salarioLiquido -= taxa3(restoSalario);
                System.out.println("Taxa de " + (taxa1(1212.0) + taxa2(2427.35) + taxa3(restoSalario)) + " aplicada.");
                System.out.println("Salario líquido: " + salarioLiquido);
            }
            return salarioLiquido;
        } else if (salario > 3641.03 && salario < 7087.23) {
            salarioLiquido = salario - taxa1(1212.0);
            restoSalario = salario - 1212.0;
            if (restoSalario < 3641.04) {
                salarioLiquido -= taxa2(2427.35);
                restoSalario -= 2427.35;
                System.out.println("Taxa de " + (taxa1(1212.0) + taxa2(2427.35) + taxa3(restoSalario)) + " aplicada.");
                salarioLiquido -= taxa3(restoSalario);
                System.out.println("Salario líquido: " + salarioLiquido);
            } else {
                salarioLiquido -= taxa2(2427.35);
                restoSalario = salario - (2427.35 + 1212);
                restoSalario = salario - (2427.35 + 1212);
                salarioLiquido -= taxa3(restoSalario);
                System.out.println("Taxa de " + (taxa1(1212.0) + taxa2(2427.35) + taxa3(restoSalario)) + " aplicada.");
                System.out.println("Salario líquido: " + salarioLiquido);


            }
        } else {
            System.out.println("Professor n passou o que é pra fazer se o salario for maior que 7087,22, foi mal ai");
        }
        return 0;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getHorasTrabalhadasMes() {
        return horasTrabalhadasMes;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }
}
