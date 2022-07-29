package one.digitalinnovation.modulo3.exceptions.Ex4;

//Exception customizada
public class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;

    //construtor
    public DivisaoNaoExataException(String message, int numerador, int denominador){
        super(message); //mensagem por default
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
