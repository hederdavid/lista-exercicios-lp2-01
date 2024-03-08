package exercicio14;

public class Retangulo extends Quadrilatero{
    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retangulo de base " + lado1 + " e altura " + lado2;
    }
}
