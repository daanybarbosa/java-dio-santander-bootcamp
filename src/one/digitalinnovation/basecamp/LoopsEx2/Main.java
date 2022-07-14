package one.digitalinnovation.basecamp.LoopsEx2;

import java.util.Scanner;

/**
 * Ex 2 - Nota
 *
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo
 * até que o usuário informe um valor válido.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida!");
            System.out.println("Digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota: " + nota);
    }

}
