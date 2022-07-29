package one.digitalinnovation.modulo3.poo.relacoes.interfaces;

/**
 * Aula 4 - POO
 * Crie uma interface chamada “OperaçãoMatematica”.
 * Crie também 4 métodos das operações básicas: soma, subtração, multiplicação e divisão.
 */

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void substracao(double operando1, double operando2) {
        System.out.println("Substração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Divisão: " + (operando1 / operando2));
    }
}
