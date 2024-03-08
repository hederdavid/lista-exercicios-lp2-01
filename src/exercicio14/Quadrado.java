package exercicio14;

public class Quadrado extends Quadrilatero {

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Quadrado de lado " + lado1;
    }
}
