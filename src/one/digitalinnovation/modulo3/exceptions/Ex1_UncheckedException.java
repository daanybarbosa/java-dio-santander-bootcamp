package one.digitalinnovation.modulo3.exceptions;

import javax.swing.*;

/**
 * Ex 1 - Unchecked Exception
 * Fazer a divisão de 2 valores inteiros
 */

public class Ex1_UncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false; //ira parar o looping
            } catch (NumberFormatException e) {
                e.printStackTrace(); //ira exibir o erro
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage()); //ira exibir uma mensagem na tela caso o usuario nao digite um numero inteiro
            } catch (ArithmeticException e) {
                e.printStackTrace(); //ira exibir o erro
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0 " + e.getMessage()); //ira exibir essa mensagem para o usuario caso ele insira o denominador 0
            } finally {
                System.out.println("Chegou no finally");
            }
        } while(continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}
