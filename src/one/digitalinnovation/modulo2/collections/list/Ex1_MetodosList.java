package one.digitalinnovation.modulo2.collections.list;

/*
 * EXEMPLO 1 - Lists
 */

import java.util.*;

public class Ex1_MetodosList {

    public static void main(String[] args) {

        // **** Formas de usar o List ****
        //List notas = new ArrayList(); // Forma usada antes do Java 5

        //List<Double> notas = new ArrayList<>(); //Generics (jdk 5) (Forma usada a partir do Java 5) - <> Diamond Operator (jdk 7)
        //List<Double> notas = new ArrayList<Double>(); //Generics (jdk 5) (Forma usada a partir do Java 5) - <> Diamond Operator (jdk 7) - pode incluir o tipo de dado dentro do Diamond Operator

        //ArrayList<Double> notas = new ArrayList<>(); // Não é uma boa prática - é recomendável programar focado na interface e não na implementação

        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // Criar a List e implementar o ArrayList

        /* List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //iniciando List e a variavel, porém é uma forma limitada, não podendo adicionar ou remover um dado na List
            notas.add(10d);
        System.out.println(notas); */

        /* List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //torna a List imutável - não podendo adicionar ou remover
            notas.add(1d);
            notas.remove(5d);
        System.out.println(notas); */

        System.out.println(" -------------------------------- ");
        System.out.println("Crie uma lista e adicione as setes notas: ");
        List<Double> notas = new ArrayList<>();
            notas.add(7d);
            notas.add(8.5);
            notas.add(9.3);
            notas.add(5d);
            notas.add(7d);
            notas.add(0d);
            notas.add(3.6);
        //System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println(" -------------------------------- ");
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //ira retornar a posição do indice com valor 5.0

        System.out.println(" -------------------------------- ");
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //index e o elemento
        System.out.println(notas);

        System.out.println(" -------------------------------- ");
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println(" -------------------------------- ");
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //ira retornar um boolean

        System.out.println(" -------------------------------- ");
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for ( Double nota : notas ) {
            System.out.println(nota);
        }

        System.out.println(" -------------------------------- ");
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); //get() -> pegar a posição
        System.out.println(notas.toString());

        System.out.println(" -------------------------------- ");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println(" -------------------------------- ");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println(" -------------------------------- ");
        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;

        while(iterator.hasNext()){ //ira verificar se tem um proximo elemento
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println(" -------------------------------- ");
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println(" -------------------------------- ");
        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // ira remover o elemento 0
        System.out.println(notas);

        System.out.println(" -------------------------------- ");
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0); //ira remover a posição 0
        System.out.println(notas);

        System.out.println(" -------------------------------- ");
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println(" -------------------------------- ");
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println(" -------------------------------- ");
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); //boolean - ira retornar se está vazia

        /**
         * Resolva esses exercicios utilizando os métodos da implementação LinkedList:
         * System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da List ArrayList nessa nova lista: "
         * System.out.println("Mostre a primeira nota da nova lista sem removê-lo: "
         * System.out.println("Mostre a primeira nota da nova lista removendo-o: "
         */
    }
}
