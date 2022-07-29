package one.digitalinnovation.modulo3.desafioProjeto.dominio;

public class Curso extends Conteudo{

    //atributos
    //private String titulo; //consta na classe Conteudo
    //private String descricao; //consta na classe Conteudo
    private int cargaHoraria;

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria; //regra de negocio
    }

    //Getter and Setter
    //consta na classe Conteudo
    /*
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    */

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria +
                '}';
    }
}
