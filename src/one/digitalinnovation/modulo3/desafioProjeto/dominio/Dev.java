package one.digitalinnovation.modulo3.desafioProjeto.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    //atributos
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    //metodos
    public void inscreverBootcamp(Bootcamp bootcamp){
        //Quando o Dev se inscrever no Bootcamp automaticamente todos os cursos do Bootcamp
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //adicionou o Dev que se inscreveu no Bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //Quando o conteudosInscritos forem finalizados, eles entrarão no conteudosConcluidos
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        //se o conteudo existe no conteudosInscritos, ele será movido para o conteudosConcluidos
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                //.mapToDouble(conteudo -> conteudo.calcularXp())
                .mapToDouble(Conteudo::calcularXp) //Lambda method
                .sum();
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
