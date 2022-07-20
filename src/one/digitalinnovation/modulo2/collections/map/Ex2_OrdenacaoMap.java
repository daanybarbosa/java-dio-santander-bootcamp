package one.digitalinnovation.modulo2.collections.map;

import java.util.*;

/**
 * Dadas as seguintes informações sobre meus livros favoritos e seus autores,
 * crie um dicionário e ordene este dicionário exibindo: (Nome Autor - Nome Livro - paginas);
 *
 * Autor = Colleen Houck - Livro = nome: A Maldição do tigre - páginas: 352
 * Autor = Beth O’Leary - Livro = nome: Teto para dois - páginas: 400
 * Autor = Casey McQuiston - Livro = nome: Vermelho, branco e sangue azul - páginas: 392
 */

public class Ex2_OrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("--\tOrdem Aleatória\t--");
        //HashMap - Ira exibir em Ordem aleatoria
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Colleen Houck", new Livro("A Maldição do Tigre", 352));
            put("Beth O’Leary", new Livro("Teto para dois", 400));
            put("Casey McQuiston", new Livro("Vermelho, Branco e Sangue azul", 392));
        }};
        for ( Map.Entry<String, Livro > livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Colleen Houck", new Livro("A Maldição do Tigre", 352));
            put("Beth O’Leary", new Livro("Teto para dois", 400));
            put("Casey McQuiston", new Livro("Vermelho, Branco e Sangue azul", 392));
        }};
        for ( Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("--\tOrdem alfabética de autores\t--");
        // TreeMap - de acordo com as chaves
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for ( Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("--\tOrdem alfabética dos nomes dos livros\t--");
        //TreeSet - para usar um comparator e ordenar de acordo com o nome dos livros
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        //System.out.println(meusLivros3);
        for ( Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("--\tOrdem número de páginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());

        for ( Map.Entry<String, Livro> livro : meusLivros4 ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
        }
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    public Integer getPaginas(){
        return paginas;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    public int hashCode(){
        return Objects.hash(nome, paginas);
    }

    public String toString(){
        return "Livro {" +
                "nome = '" + nome + '\'' +
                ", paginas = " + paginas +
                '}';
    }
}

//Comparator para buscar o nome e compara-lo
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPagina implements  Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
