package br.com.dio.Ex1_introducaoSpring.config;

import javax.inject.Named;

@Named
public class CdiTeste {

    public void executaTeste(){
        System.out.println("Executando metodo via CDI");
    }
}
