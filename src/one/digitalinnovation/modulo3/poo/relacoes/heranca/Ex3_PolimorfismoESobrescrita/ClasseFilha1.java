package one.digitalinnovation.modulo3.poo.relacoes.heranca.Ex3_PolimorfismoESobrescrita;

/**
 * Aula 4 - POO
 * Análise do comportamento de Polimorfismo e Sobrescrita.
 */

//Classe filha herda de classe mae
public class ClasseFilha1 extends ClasseMae {

    @Override //Sobrescrever
    void metodo1(){
        System.out.println("Método 1 da Classe Filha 1");
    }
}
