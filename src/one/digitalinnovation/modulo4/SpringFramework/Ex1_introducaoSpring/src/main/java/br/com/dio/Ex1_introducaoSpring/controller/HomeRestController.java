package br.com.dio.Ex1_introducaoSpring.controller;

import br.com.dio.Ex1_introducaoSpring.entity.User;
import br.com.dio.Ex1_introducaoSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @Autowired
    private UserService service;

    @RequestMapping("/rest")
    public User testeRest(){
        return service.buscaUsuarioPorId(1L);
    }
}
