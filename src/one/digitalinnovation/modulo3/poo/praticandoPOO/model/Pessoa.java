package one.digitalinnovation.modulo3.poo.praticandoPOO.model;

public class Pessoa {

    //constante estatica - numero magico
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa { FISICA, JURIDICA }

    public Integer codigo;
    public String nome;
    //public String documento;
    private String documento;
    public TipoPessoa tipo;

    //Getters / Setters
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()) { //o documento nao pode ser nulo ou vazio
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        }

        //numero magico
        if (documento.length() == TAMANHO_CPF){
            //tipo = TipoPessoa.FISICA;
            setDocumento(documento, tipo = TipoPessoa.FISICA);

        } else if (documento.length() == TAMANHO_CNPJ) {
            //tipo = TipoPessoa.JURIDICA;
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento inválido para pessoa fisica ou jurifica");
        }
        this.documento = documento;
    }

    private void setDocumento(String documento, TipoPessoa tipo){
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo(){
        return tipo;
    }
}
