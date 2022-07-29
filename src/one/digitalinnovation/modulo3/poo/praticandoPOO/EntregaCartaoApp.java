package one.digitalinnovation.modulo3.poo.praticandoPOO;

import one.digitalinnovation.modulo3.poo.praticandoPOO.model.Cliente;
import one.digitalinnovation.modulo3.poo.praticandoPOO.model.Endereco;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        // dados do endereco
        endereco.cep = "000000";

        Cliente cliente = new Cliente();
        // dados do cliente


        // Exemplo com o ArrayList
        /* if (cliente.enderecos == null){
            cliente.enderecos = new ArrayList<Endereco>();
        } */

        //cliente.enderecos.add(endereco);
        //cliente.getEnderecos().add(endereco);

        //Usando try/catch -> tratamentos de erros
        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }

        //metodo AdicionaEndereco
        /* cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso!"); */
    }
}
