package br.com.dio.Ex1_introducaoSpring.service;

import br.com.dio.Ex1_introducaoSpring.entity.User;
import br.com.dio.Ex1_introducaoSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Inserir as dependencias Service para o Spring
@Service
public class UserService {

    //PROXIES SETTER - Propriedade
    @Autowired //ponto de injecao
    private UserRepository userRepository;

    //PROXIES SETTER - Construtor
    /*
    @Autowired //ponto de injecao
    public UserService(UserRepository repository){
        this.userRepository = repository;
    }
     */

    //PROXIES SETTER - Método
    /*
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        // regra de negocio
        // executa outra regra
        this.userRepository = userRepository;
    }
     */

    //busca de dados no banco
    public List<String> buscaDadosBanco() {
        List<String> nomes = new ArrayList<>();
        System.out.println("Chamou o metodo de busca");
        return nomes;
    }

    public void deletaDados(){
        //List<Integer> ids = buscaIdsParaDelete();
        System.out.println("Chamou o delete ");
        //userRepository.deleteDados();
        //userRepository.deleteById(1L); //Erro - ainda nao existe esse Id
    }

    public User buscaUsuarioPorId(long id) {
        User user = new User();
        user.setNome("Daniele");
        userRepository.save(user);

        return userRepository.findById(id).get();
    }
}


