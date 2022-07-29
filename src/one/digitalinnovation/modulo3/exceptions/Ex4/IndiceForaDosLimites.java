package one.digitalinnovation.modulo3.exceptions.Ex4;

public class IndiceForaDosLimites extends Exception{

    private int numerador;
    private int denominador;

    public IndiceForaDosLimites(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
