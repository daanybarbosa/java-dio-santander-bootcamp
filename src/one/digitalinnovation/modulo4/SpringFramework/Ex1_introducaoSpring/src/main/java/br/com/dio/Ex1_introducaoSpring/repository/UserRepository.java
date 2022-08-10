package br.com.dio.Ex1_introducaoSpring.repository;

import br.com.dio.Ex1_introducaoSpring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /*
    public void deleteDados(){
        System.out.println("Apagando dados");
    } */
}
