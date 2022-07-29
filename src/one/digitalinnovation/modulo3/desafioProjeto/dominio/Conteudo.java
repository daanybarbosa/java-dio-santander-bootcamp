package one.digitalinnovation.modulo3.desafioProjeto.dominio;

public abstract class Conteudo {

    //Constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //metodo abstrato
    public abstract double calcularXp();

    //Getter e Setter
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


}
