package one.digitalinnovation.basecamp.MetodosAula1;

/**
 * Criar uma aplicação que resolva as seguintes situações:
 * Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 * A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
 * Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
 * Defina arbitrariamente as faixas que influenciam nos valores.
 */
public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio - Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7 ,8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercicio - Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);

        //Emprestimo
        System.out.println("Exercicio - Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
