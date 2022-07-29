package one.digitalinnovation.modulo3.poo.relacoes.heranca.Ex2_UpcastEDowncast;

/**
 * Aula 4 - POO
 * Crie as classes “Funcionario”, “Gerente”, “Vendedor” e “Faxineiro”.
 * Realize upcasts e downcasts.
 */

public class RodarAplicacao {

    public static void main(String[] args) {

        // Classe instanciada - variavel - Objeto
        Funcionario funcionario = new Funcionario();

        //Upcast
        //Funcionario (classe mãe) - Gerente/Vendedor/Faxineiro (subtipo)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        //Gerente gerente1 = new Funcionario(); //erro - não está explicito
        Vendedor vendedor1 = (Vendedor) new Funcionario(); //forma explicita
    }
}
