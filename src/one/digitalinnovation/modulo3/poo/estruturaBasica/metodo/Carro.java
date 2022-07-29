package one.digitalinnovation.modulo3.poo.estruturaBasica.metodo;

/**
 * Aula 3 - POO
 * Ex 3 - Defina um método para calcular o valor total para encher o tanque.
 * Este deve receber como parâmetro o valor da gasolina. Faça também duas sobrecargas do construtor.
 */
public class Carro {

    //Uma boa pratica é 1 - atributos, 2 - construtores, 3 - get/set, 4 - metodos
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
