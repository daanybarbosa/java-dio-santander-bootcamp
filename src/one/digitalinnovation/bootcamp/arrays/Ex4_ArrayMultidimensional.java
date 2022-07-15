package one.digitalinnovation.bootcamp.arrays;

import java.util.Random;

/**
 * Ex 4 - Array Multidimensional
 *
 * Gerar e imprimir uma matriz M 4x4 com valores aleatórios entre 0-9
 */

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] M = new int[4][4];

        //i = primeira linha do array
        for(int i = 0; i < M.length; i++){
            //j = coluna
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for ( int[] linha : M ) {
            for ( int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
