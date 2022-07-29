package one.digitalinnovation.modulo3.desafioCodigo;

import java.util.Scanner;

/**
 * O gerente de uma loja de produtos eletrodomésticos ficou maluco e decidiu que todos
 * os produtos da loja estavam na promoção com 70% de desconto.
 * Ele percebeu que precisa automatizar o seu sistema para que nessas promoções o novo preço
 * seja automaticamente calculado e repassado para os vendedores. Faça um algoritmo que leia o desconto
 * e o preço de um produto e e mostre o seu novo preço com esse desconto.
 */

public class desafio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: complete os espaços em branco com sua solução para o problema
        System.out.println("Insira o valor de desconto: ");
        int desconto = input.nextInt();

        System.out.println("Insira o valor do produto: ");
        int precoAntigo = input.nextInt();

        int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
        System.out.println(  precoNovo   );
    }
}
