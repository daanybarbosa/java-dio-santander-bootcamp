package one.digitalinnovation.modulo3.poo.estruturaBasica.objetoEMensagem;

/**
 * Ex 4 - POO
 * Evolua o conceito do exercício 3 criando objetos da classe “Carro”.
 * Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores “get”.
 * Passe também uma mensagem para o cálculo do total para encher o tanque.
 */

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor - vazio
    Carro(){

    }

    //Construtor - preenchido
    Carro( String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //set - usado para setar/armazenar um valor no atributo
    void setCor(String cor){
        this.cor = cor;
    }

    //get - retornar o valor armazenado dentro do atributo
    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    //get e set tanque
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //método do total para encher o tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
