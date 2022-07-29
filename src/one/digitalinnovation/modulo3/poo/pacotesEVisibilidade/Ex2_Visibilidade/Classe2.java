package one.digitalinnovation.modulo3.poo.pacotesEVisibilidade.Ex2_Visibilidade;

/**
 * Aula 5 - POO
 * Ver projeto de exemplo para entender o funcionamento da visibilidade.
 */

//Classe2 é uma subclasse
public class Classe2 extends Classe1 {

    // Atributos proprios

    void metodo(){

        //atributo2 e 3
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    //metodo2 e 3
    @Override
    protected void metodo2() {
        super.metodo2();
    }

    @Override
    public void metodo3() {
        super.metodo3();
    }
}
