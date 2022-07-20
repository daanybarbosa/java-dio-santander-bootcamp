package one.digitalinnovation.modulo2.collections.set;

import java.util.*;

/**
 * Dadas as seguintes informacoes sobre as minhas series favoritas.
 * Crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episodio)
 * <p>
 * Serie 1 - Nome: GOT, genero: fantasia, tempoEpisodio: 60
 * Serie 2 - Nome: Dark, genero: drama, tempoEpisodio: 60
 * Serie 3 - Nome: That '70s show, genero: comedia, tempoEpisodio: 25
 */

public class Ex2_OrdernacaoSet {

    public static void main(String[] args) {

        System.out.println(" -------------------------------- ");
        System.out.println("--\tOrdem aleatória\t--");

        // HashSet - irá inserir os dados de uma forma não ordenada
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("The Office", "Comédia", 25));
        }};
        //forEach
        for (Serie serie : minhasSeries) {
            System.out.println(
                    serie.getNome() + " - " +
                            serie.getGenero() + " - " +
                            serie.getTempoEpisodio());
        }

        System.out.println(" -------------------------------- ");
        System.out.println("--\tOrdem inserção\t--");

        // LinkedHashSet irá respeitar a ordem de inserção dos dados.
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("The Office", "Comédia", 25));
        }};

        // forEach
        for (Serie serie : minhasSeries1) {
            System.out.println(
                    serie.getNome() + " - " +
                            serie.getGenero() + " - " +
                            serie.getTempoEpisodio());
        }

        System.out.println(" -------------------------------- ");
        System.out.println("--\tOrdem natural (tempoEpisodio)\t--");

        // TreeSet - Determinar a prioridade nos dados, nesse caso, a prioridade é o tempoEpisodio
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        //forEach
        for (Serie serie : minhasSeries2) {
            System.out.println(
                    serie.getNome() + " - " +
                            serie.getGenero() + " - " +
                            serie.getTempoEpisodio());
        }

        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);

        System.out.println(" -------------------------------- ");
        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        //forEach
        for (Serie serie : minhasSeries3) {
            System.out.println(
                    serie.getNome() + " - " +
                            serie.getGenero() + " - " +
                            serie.getTempoEpisodio());
        }
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    // Criação da classe Serie - inserir os atributos
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public String toString() {
        return "{" +
                "nome = '" + nome + '\'' +
                ", genero = '" + genero + '\'' +
                ", tempoEpisodio = '" + tempoEpisodio +
                '}';
    }


    //Ira fazer a verificação se existe um hashCode dentro da aplicação
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        //return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

        // Set não admite duplicações, caso algum dado for igual, nesse caso, qdo o tempoEpisodio estão iguais, irá comparar pelo o genero
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }

}

/*
Classe criada para determinar a prioridade que serão comparados os dados:
nome -> genero -> tempoEpisodio
1 - Se os nomes forem diferentes será piorizado o nome, se for igual será comparado o genero
2 - Se o genero for diferente será priorizado o genero, caso esteja igual será comparado com o tempo de episodio
3 - Se o tempoEpisodio também for igual, será considerado a mesma serie e não será incluso na listagem
*/
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
