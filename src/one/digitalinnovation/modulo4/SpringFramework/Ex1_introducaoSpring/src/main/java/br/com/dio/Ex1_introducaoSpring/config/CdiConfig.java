package br.com.dio.Ex1_introducaoSpring.config;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiConfig {

    @Inject //injetando o CDI
    private CdiTeste cdiTeste;

    @PostConstruct
    public void init(){
        cdiTeste.executaTeste();
    }
}
