package one.digitalinnovation.modulo3.poo.estruturaBasica.objetoEMensagem;

/**
 * Ex 4 - POO
 */

public class RodarAplicacao {

    public static void main(String[] args) {

        //Classe - Objeto - Construtor padrão (sem parametros)
        Carro carro1 = new Carro();

        //Chamando os metodos e inserindo os valores
        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(59);

        //Exibir os valores dos metodos
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //Construtor - Sobrecarga (com parametros)
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Class C", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));
    }
}
