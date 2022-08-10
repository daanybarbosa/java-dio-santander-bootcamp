package br.com.dio.Ex1_introducaoSpring.controller;

import br.com.dio.Ex1_introducaoSpring.config.BeanTeste;
import br.com.dio.Ex1_introducaoSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //Spring ira fazer a instancia automaticamente
    @Autowired
    private UserService userService;

    @Autowired
    private BeanTeste teste1;

    //@Autowired
    //private BeanTeste teste2;


    @RequestMapping("/")
    public String home (Model model) {

        // -------- Scope("singleton") --------
        /*
        userService.buscaDadosBanco();
        userService.deletaDados();

        teste1.setNome("Bean teste 1");
        System.out.println(teste1.getNome()); //Bean teste 1
        System.out.println(teste2.getNome()); //Bean teste 1

        model.addAttribute("mensagem", "Hello Word");
        return "home";
         */

        // -------- Scope("prototype") --------
        /*
        userService.buscaDadosBanco();
        userService.deletaDados();

        teste1.setNome("Bean teste 1");
        System.out.println(teste1.getNome()); //Bean teste 1
        System.out.println(teste2.getNome()); //null

        model.addAttribute("mensagem", "Hello Word");
        return "home";
         */

        // -------- Scope("RequestScope") --------
        /*
        //userService.buscaDadosBanco();
        //userService.deletaDados();

        System.out.println(teste1.getNome()); //null
        teste1.setNome("Bean teste 1");
        System.out.println(teste1.getNome()); //Bean teste 1

        model.addAttribute("mensagem", "Hello Word");
        return "home";
        */

        // -------- Scope("SessionScope") --------
        /*
        //No refresh da pagina, ira manter os dados do usuario
        //Em um novo navegador, ira criar uma nova sessão

        //userService.buscaDadosBanco();
        //userService.deletaDados();

        System.out.println(teste1.getNome()); //null
        teste1.setNome("Bean teste 1");
        System.out.println(teste1.getNome()); //Bean teste 1

        model.addAttribute("mensagem", "Hello Word");
        return "home";
         */

        // -------- Scope("Aplication") --------
        /*
        //No refresh da pagina, ira manter os dados do usuario
        //Em um novo navegador, ira criar uma nova sessão

        //userService.buscaDadosBanco();
        //userService.deletaDados();

        System.out.println(teste1.getNome()); //null
        teste1.setNome("Bean teste 1");
        System.out.println(teste1.getNome()); //Bean teste 1

        model.addAttribute("mensagem", "Hello Word");
        return "home";
         */

        // Injeção de dependencias
        userService.buscaDadosBanco();
        userService.deletaDados();
        userService.buscaUsuarioPorId(1);

        //model.addAttribute("mensagem", "Hello Word");
        return "home";
    }
    // Injeção de dependencias
    /*
    public static void main(String[] args) {
        HomeController home = new HomeController();

        String retorno = home.home(null); //error - nao pode ser null
        System.out.println(retorno);
    }
     */

}

// ***** Exemplo - Quando o usuario chamar a pagina index ******
    /*
    @RequestMapping("/index")
    public String index(Model model) {

        model.addAttribute("mensagemBoasVindas", "Bem vindo ao nosso site");
        return "index";
    }*/

    /* *** Exemplo para forçar a implementacao da interface - Spring ***
    public static void main(String[] args) {
        HomeController controller = new HomeController();

        //Implementacao da Interface - Spring
        Model model = new Model() {
            @Override
            public Model addAttribute(String s, Object o) {
                return null;
            }

            @Override
            public Model addAttribute(Object o) {
                return null;
            }

            @Override
            public Model addAllAttributes(Collection<?> collection) {
                return null;
            }

            @Override
            public Model addAllAttributes(Map<String, ?> map) {
                return null;
            }

            @Override
            public Model mergeAttributes(Map<String, ?> map) {
                return null;
            }

            @Override
            public boolean containsAttribute(String s) {
                return false;
            }

            @Override
            public Object getAttribute(String s) {
                return null;
            }

            @Override
            public Map<String, Object> asMap() {
                return null;
            }
        };

        controller.home(model);
        controller.index(model);
    }*/
