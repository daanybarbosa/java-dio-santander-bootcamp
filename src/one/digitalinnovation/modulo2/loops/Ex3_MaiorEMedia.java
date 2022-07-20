package one.digitalinnovation.modulo2.loops;

import java.util.Scanner;

/**
 * Ex 3 - Maior e Média
 *
 * Faça um programa que leia 5 números
 * e informe o maior número e a média desses números.
 */

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            //obter a soma dos numeros inseridos
            soma = soma + numero;

            //obter o maior numero
            if (numero > maior) maior = numero;

            //count = count + 1;
            count++;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / 5));
    }
}
