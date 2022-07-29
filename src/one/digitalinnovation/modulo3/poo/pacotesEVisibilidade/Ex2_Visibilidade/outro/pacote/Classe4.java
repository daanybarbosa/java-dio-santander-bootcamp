package one.digitalinnovation.modulo3.poo.pacotesEVisibilidade.Ex2_Visibilidade.outro.pacote;

import one.digitalinnovation.modulo3.poo.pacotesEVisibilidade.Ex2_Visibilidade.Classe1;

/**
 * Aula 5 - POO
 * Ver projeto de exemplo para entender o funcionamento da visibilidade.
 */

public class Classe4 {

    //Associação com a classe1
    Classe1 classe1;

    void metodo(){

        //atributo3
        //classe1.atributo3; //public

        //metodo3
        classe1.metodo3(); //public
    }
}
