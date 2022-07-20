package one.digitalinnovation.modulo2.metodos.Ex2;

/**
 * Crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
 * Obs: Use sobrecarga.
 */

public class Main {

    public static void main(String[] args) {

        //Quadrilatero
        System.out.println("Exercicio - Quadrilátero");
        Quadrilatero.area(3);
        //Quadrilatero.area(5, 5); //double
        Quadrilatero.area(5d, 5d); //double
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f); //float
    }
}
