package one.digitalinnovation.modulo3.desafioProjeto.dominio;

import java.time.LocalDate;

//A classe Mentoria é filha da classe Conteudo
public class Mentoria extends Conteudo {

    //atributos
    //String titulo; //consta na classe Conteudo
    //String descricao; //consta na classe Conteudo
    LocalDate data;

    //implementar metodo - calcularXP
    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d; //quando criar uma mentoria, irá adicionar no XP_PADRAO + 20d
    }

    //Getter and Setter
    /*
    ** consta na classe Conteudo **
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

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }
}
