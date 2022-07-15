package one.digitalinnovation.bootcamp.loops;

import java.util.Scanner;

/**
 * Ex 1 - Nome e Idade
 *
 * Faça um programa que leia conjuntos de dois valores,
 * O primeiro representando o nome do aluno e o segundo representando a sua idade.
 * Pare ao inserir o valor 0 no campo nome
 */
public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
        System.out.println("Finalizando programa ...");
    }
}
