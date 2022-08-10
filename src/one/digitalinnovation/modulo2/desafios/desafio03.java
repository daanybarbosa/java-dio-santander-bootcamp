package one.digitalinnovation.modulo2.desafios;

import java.io.IOException;
import java.util.Scanner;

/**
 * Desafio
 * O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.
 *
 * Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.  Deve-se permitir que, ao indicar o índice do vetor, seja indicado qual funcionário está armazenado dentro dessa memória.
 *
 * Entrada
 * As primeiras 5 linhas da entrada deverá contaro o vetor NOMES com 5 espaços na memoria, a última linha deverá conter a posição escolhida do vetor.
 *
 * Saída
 * A saída deverá retornar o nome de acordo com a posição do vetor escolhida anteriormente, conforme exemplo abaixo.
 */

public class desafio03 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe os nomes: ");
            nomes[i] = scan.nextLine();
        }

        System.out.println("Informe a posição do nome: ");
        int pos = scan.nextInt();
        System.out.println(nomes[pos]);
    }
}

