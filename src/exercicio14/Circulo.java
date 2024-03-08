package exercicio14;

public class Circulo implements FormaGeometrica {

    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo de raio " + raio;
    }
    public String toString2() {
        return "Circulo";
    }
}
