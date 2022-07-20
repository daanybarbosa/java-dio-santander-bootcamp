package one.digitalinnovation.modulo2.arrays;

/**
 * Ex 1 - Ordem Inversa
 *
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4}; //unidimensional

        int count = 0;

        System.out.print("Tamanho do vetor: " + vetor.length);
        System.out.print("\nVetor original: ");

        while(count <= vetor.length - 1){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor invertido: ");

        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
