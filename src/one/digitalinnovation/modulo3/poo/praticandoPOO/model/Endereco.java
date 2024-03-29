package one.digitalinnovation.modulo3.poo.praticandoPOO.model;

public class Endereco {

    public enum TipoEndereco{ RESIDENCIAL, ENTREGA, TRABALHO }

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;
    public TipoEndereco tipo;
}
