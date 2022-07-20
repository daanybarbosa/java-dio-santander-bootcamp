package one.digitalinnovation.modulo2.metodos.Ex3;

public class Quadrilatero {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    /*
    public static void xpto(){
        System.out.println("antes");
        return; //por ter um retorno void, não é necessario inserir o "return"
    }

    public static float abc(){
        return 1.6; //imcompartibilidade do retorno float com o valor que será retornado.
    }
     */
}
