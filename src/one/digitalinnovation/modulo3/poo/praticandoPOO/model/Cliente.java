package one.digitalinnovation.modulo3.poo.praticandoPOO.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    /*public Integer codigo;
    public String nome;
    public String cpf;*/

    public String numCartao;

    //public List<Endereco> enderecos;
    private List<Endereco> enderecos;

    /*
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }*/

    //metodo
    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }

        if (endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
