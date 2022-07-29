package one.digitalinnovation.modulo3.poo.pacotesEVisibilidade.Ex2_Visibilidade;

/**
 * Aula 5 - POO
 * Ver projeto de exemplo para entender o funcionamento da visibilidade.
 */

//Não herda da classe1
public class Classe3 {

    //necessario ter uma associação em relação a classe 1
    Classe1 classe1;

    void metodo(){

        //atributo2 e 3
        //classe1.atributo2; //protected
        //classe1.atributo3; //public

        //metodo2 e 3
        classe1.metodo2(); //protected
        classe1.metodo3(); //public
    }
}
