package exercicio14;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeFormasGeometricas = 0;
        double altura;
        double base;
        double raio;
        String formaGeometrica;

        System.out.print("Insira a quantidade de formas geométricas: ");
        quantidadeFormasGeometricas = scanner.nextInt();

        FormaGeometrica[] formasGeometricas = new FormaGeometrica[quantidadeFormasGeometricas];
        scanner.nextLine();

        for (int i = 0; i < quantidadeFormasGeometricas; i++) {
            System.out.print("Insira a forma geométrica: ");
            formaGeometrica = Normalizer.normalize(scanner.nextLine(), Normalizer.Form.NFD)
                    .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
            formaGeometrica = formaGeometrica.toLowerCase();
            switch (formaGeometrica) {
                case "quadrado" -> {
                    System.out.print("Insira o valor do lado (em cm): ");
                    base = scanner.nextDouble();
                    Quadrado quadrado = new Quadrado(base);
                    formasGeometricas[i] = quadrado;
                    scanner.nextLine();
                }
                case "circulo" -> {
                    System.out.print("Insira o valor do raio (em cm): ");
                    raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    formasGeometricas[i] = circulo;
                    scanner.nextLine();
                }
                case "retangulo" -> {
                    System.out.print("Insira o valor da base (em cm): ");
                    base = scanner.nextDouble();
                    System.out.print("Insira o valor da altura (em cm): ");
                    altura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);
                    formasGeometricas[i] = retangulo;
                    scanner.nextLine();
                }
                default -> {
                    System.out.println("Insira um valor valido!");
                    i = -1;
                }
            }
        }

        for (FormaGeometrica forma : formasGeometricas) {
            System.out.println(forma.toString());
            if (forma.toString().equals("Circulo")) {
                System.out.print("Area: ");
                System.out.println(forma.calcularArea());
                System.out.print("Perímetro: ");
                System.out.println(forma.calcularPerimetro());
            } else {
                System.out.print("Perímetro: ");
                System.out.println(forma.calcularPerimetro());
            }

        }
    }
}
