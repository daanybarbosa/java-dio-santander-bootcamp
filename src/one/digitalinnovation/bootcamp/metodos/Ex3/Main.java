package one.digitalinnovation.bootcamp.metodos.Ex3;

/**
 * Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis.
 * Agora faça os métodos retornarem valores.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio - Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Area do Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Area do Trapezio: " + areaTrapezio);

    }
}
