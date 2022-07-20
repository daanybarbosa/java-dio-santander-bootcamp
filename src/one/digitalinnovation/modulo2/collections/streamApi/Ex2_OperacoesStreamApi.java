package one.digitalinnovation.modulo2.collections.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex2_OperacoesStreamApi {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        // Exemplo - Sem Lambda
        /*
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */

        // Exemplo - Com Lambda
        // numerosAleatorios.stream().forEach(s -> System.out.println(s));

        // Exemplo - forEach do List
        // numerosAleatorios.forEach(s -> System.out.println(s));

        // Com method reference
        numerosAleatorios.forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        //Set - não aceita números repetidos
        // Com forEach
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Criando uma variavel Set
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println(collectSet);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
        // Exemplo 1
        /*
        numerosAleatorios.stream()
                // Function irá receber uma String e irá retornar um Integer
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }})
                .forEach(System.out::println);
        */

        // Exemplo 2 - forEach
        //numerosAleatorios.stream().map((s -> Integer.parseInt(s))).collect(Collectors.toList()).forEach(System.out::println);

        // Exemplo 3 - Com method reference
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // Exemplo 4 - Criar dentro de uma variavel
        /*
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);
         */

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        // Exemplo 1
        /*
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if( i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList())
                .forEach(System.out::println);
         */

        // Exemplo 2 - Dentro de uma variavel
        /*
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if( i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);
        */

        // Exemplo 3 - Com lambda
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Mostre a média dos números: ");
        // Exemplo 1
        /*
        numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String s) {
                        return Integer.parseInt(s);
                    }
                });
        */

        // Exemplo 2 - Com lambda
        //numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s));

        //Exemplo 3
        /*
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double value) {
                        System.out.println(value);
                    }
                });
        */

        // Exemplo 4 - Com lambda
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Remova os valores impares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        // Exemplo 1 - metodo de List
        /*
        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 != 0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);
        */

        // Exemplo 2 - Com lambda
        numerosAleatoriosInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosInteger);

        System.out.println("-------------------------------------------------------------------------");
        /*
        // Exercicios
        System.out.println("Ignore os 3 primeiro elementos da lista e imprima o restante: ");
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");
        System.out.println("Mostre o menor valor da lista: ");
        System.out.println("Mostre o maior valor da lista: ");
        System.out.println("Pegue apenas os números impares e soma: ");
        System.out.println("Mostre a lista na ordem númerica: ");
        System.out.println("Agrupe os valores impares multiplos de 3 e de 5: ");
        dica: collect(Collections.groupingBy(new Function()));

         */
    }
}
