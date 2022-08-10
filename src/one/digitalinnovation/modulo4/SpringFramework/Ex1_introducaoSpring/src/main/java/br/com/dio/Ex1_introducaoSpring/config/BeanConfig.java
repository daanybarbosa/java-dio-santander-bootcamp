package br.com.dio.Ex1_introducaoSpring.config;

import br.com.dio.Ex1_introducaoSpring.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

/**
 * Classe criada para que o Spring possa monitorar as classes Bean
 * Brean customizar o controle do Spring
 */

@Configuration //arquivo de configuracao
public class BeanConfig {

    //Bean que retorna o repositorio
    /*
    @Bean
    public UserRepository userRepository(){
        System.out.println("UserRepository --- ");
        return new UserRepository();
    }*/

    // -------- Scope("singleton") --------
    @Bean
    @Scope("singleton")
    public BeanTeste beanTeste(){
        return new BeanTeste();
    }

    /*
    // -------- Scope("prototype") --------
    @Bean
    @Scope("prototype")
    public BeanTeste beanTeste(){
        return new BeanTeste();
    }
     */

    /*
    // -------- Scope("RequestScope") --------
    @Bean
    @RequestScope
    public BeanTeste beanTeste(){
        return new BeanTeste();
    }
     */

    /*
    // -------- Scope("SessionScope") --------
    @Bean
    @SessionScope
    public BeanTeste beanTeste(){
        return new BeanTeste();
    }
     */

    /*
    // -------- Scope("Aplication") --------
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public BeanTeste beanTeste(){
        return new BeanTeste();
    }
     */

    /*
    // -------- Scope("Websocket") --------
    //nao temos um websocket configurado para a nossa aplicacao
    @Bean
    @Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public BeanTeste beanTeste(){
        return new BeanTeste();
    }
     */


}
