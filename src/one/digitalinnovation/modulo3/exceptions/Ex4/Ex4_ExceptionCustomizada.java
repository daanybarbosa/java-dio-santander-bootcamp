package one.digitalinnovation.modulo3.exceptions.Ex4;

import javax.swing.*;

/**
 * Ex 4 - Exception Customizada
 *
 * Exceptions
 * - Divisão com valores incorretos, ex: 5/4 = 1
 * - ArithmeticException - divisão por zero
 * - ArrayIndexOutOfBoundsException - ocorre quando se tenta acessar uma posição inexistente de um vetor (Index 4 out of bounds for length 4)
 */

public class Ex4_ExceptionCustomizada {

    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++){

            // Erro - Divisão de um valor impar por um par, ex: 5/4 = 1
            //Se o valor for impar, irá lançar a exception customizada
            //try/catch - tratando a exception

            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata ", numerador[i], denominador[i]);

                if (denominador[i] == 0)
                    throw new DivisaoPorZero("Divisão por zero ", numerador[i], denominador[i]);

                /*if (numerador.length != 5)
                    throw new IndiceForaDosLimites("Posição inexistente no vetor", numerador[i], denominador[i]);
*/
                int resultado = numerador[i] / denominador[i];
                System.out.println(numerador[i] + " / " + denominador[i] + " = " + resultado);
            } catch (DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (DivisaoPorZero e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
                //throw new RuntimeException(e);
            } /*catch (IndiceForaDosLimites e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
                //throw new RuntimeException(e);
            }*/

            System.out.println("O programa continua...");
        }
    }
}

