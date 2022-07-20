package one.digitalinnovation.modulo2.collections.map;

import java.util.*;

/**
 * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 * - modelo = gol - consumo = 14,4 km/l
 * - modelo = uno - consumo = 15,6 km/l
 * - modelo = mobi - consumo = 16,1 km/l
 * - modelo = hb20 - consumo = 14,5 km/l
 * - modelo = kwid - consumo = 15,6 km/l
 */

public class Ex1_MetodosMap {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        //HashMap - não ordena os dados
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            //No caso do Map, não existe o add, conseguimos adicionar os dados pelo o método put
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        //System.out.println(carrosPopulares.toString());
        System.out.println(carrosPopulares);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Substitua o consumo do Gol por 15.2 km/l: ");
        // Map - não permite duplicatas, como já existe a key (chave) "Gol" iremos apenas sobreescrever o dado
        //carrosPopulares.put("Gol", 15.2);
        carrosPopulares.put("Gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println("-------------------------------------------------------------------------");
        // containsKey - ira verificar se key (chave) existe na lista
        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Uno"));

        System.out.println("-------------------------------------------------------------------------");
        // get - iremos passar a chave e será retornado o seu valor
        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Exiba os modelos: ");
        // keySet - retorna um Set
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Exiba os consumos dos carros: ");
        // values - retorna uma Collection
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        // Max - irá retornar o maior numero dentro da Collection
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        System.out.println("Consumo mais eficiente: " + consumoMaisEficiente);

        // Ordernar por chave/valor
        //entrySet() - retorna um Set e os elementos dentro desse Set são do tipo Entry
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        //variavel de controle
        String modeloMaisEficiente = "";

        //forEach
        for ( Map.Entry<String, Double> entry : entries ) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Exiba o modelo menos econômico e seu consumo: ");

        // Verificar os carros q tem o menor consumo
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        // Usar o entrySet - ira retornar o Set que será possivel manipular chave/valor separadamente.
        for ( Map.Entry<String, Double> entry : carrosPopulares.entrySet() ) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        // size() - retorna o tamanho
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Exiba a média dos consumos deste dicionario de carros: " + (soma / carrosPopulares.size()));

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        //System.out.println(carrosPopulares1.toString());
        System.out.println(carrosPopulares1);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        //System.out.println(carrosPopulares2.toString());
        System.out.println(carrosPopulares2);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Confira se o dicionário está vázio: ");
        System.out.println("carrosPopulares: " + carrosPopulares.isEmpty());
        System.out.println("carrosPopulares1: " + carrosPopulares1.isEmpty());
        System.out.println("carrosPopulares2: " + carrosPopulares2.isEmpty());
        System.out.println("-------------------------------------------------------------------------");
    }
}
