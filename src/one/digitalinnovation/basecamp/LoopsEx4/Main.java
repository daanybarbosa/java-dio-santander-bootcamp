package one.digitalinnovation.basecamp.LoopsEx4;

import java.util.Scanner;

/**
 * Ex 4 - Par e Impar
 *
 * Faça um programa que peça n números inteiros.
 * Calcule e mostre a quantidade de números pares e números impares.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdeNumeros;
        int numero;
        int qtdePares = 0;
        int qtdeImpares = 0;
        int count = 0;

        System.out.println("Quantidade de números: ");
        qtdeNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                qtdePares++;
            } else {
                qtdeImpares++;
            }
            count++;
        } while(count < qtdeNumeros);

        System.out.println("Quantidade de números pares: " + qtdePares);
        System.out.println("Quantidade de números impares: " + qtdeImpares);
    }
}
