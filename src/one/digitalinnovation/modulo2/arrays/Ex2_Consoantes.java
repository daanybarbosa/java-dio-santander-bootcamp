package one.digitalinnovation.modulo2.arrays;

import java.util.Scanner;

/**
 * Ex 2 - Consoantes
 *
 * Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int qtdeConsoantes = 0;
        int count = 0;

        do {
            System.out.print("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))
            ){
                consoantes[count] = letra;
                qtdeConsoantes++;
            }
            count++;
        } while(count < consoantes.length);

        System.out.print("Consoantes: ");

        //foreach
        for (String consoante : consoantes ) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + qtdeConsoantes);
        System.out.println("Tamanho do array: " + consoantes.length);
    }
}
