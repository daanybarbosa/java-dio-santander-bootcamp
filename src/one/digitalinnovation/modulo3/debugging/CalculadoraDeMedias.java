package one.digitalinnovation.modulo3.debugging;

import java.util.Scanner;

/**
 * Ex 2 - Debugando o codigo
 */

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Daniele", "Bruno", "Rafael", "Evelyn" };

        //int media = calculaMediaDaTurma(alunos, scan);
        double media = calculaMediaDaTurma(alunos, scan);

        //System.out.printf("Média da turma: %d", media);
        System.out.printf("Média da turma: %.1f", media);
    }

    //public static int calculaMediaDaTurma(String[] alunos, Scanner scanner){
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){

        //int soma = 0;
        double soma = 0;
        for (String aluno : alunos ){
            System.out.printf("Nota do aluno %s: ", aluno);
            //int nota = scanner.nextInt();
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
