package one.digitalinnovation.modulo3.poo.relacoes.heranca.Ex3_PolimorfismoESobrescrita;

/**
 * Aula 4 - POO
 * Análise do comportamento de Polimorfismo e Sobrescrita.
 */

public class RodarAplicacao {

    public static void main(String[] args) {

        //ClasseMae[] - vetor
        ClasseMae[] classes = new ClasseMae[]{ new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //foreach - ira chamar o metodo1() de cada classe dentro do vetor
        for (ClasseMae classe : classes){
            classe.metodo1(); //polimorfismo - para as classes classeFIlha1 e classeFilha2
        }

        System.out.println(" ");

        for (ClasseMae classe : classes){
            classe.metodo2(); //polimorfismo - somente para a classeFilha2
        }

        System.out.println(" ");

        //Sobrescrita - instanciando diretamente a classeFilha2 e realizou a sobrescrita do método
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

    }
}
