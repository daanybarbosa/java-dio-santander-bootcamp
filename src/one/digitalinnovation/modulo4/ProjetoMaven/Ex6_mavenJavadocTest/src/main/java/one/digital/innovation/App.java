package one.digitalinnovation.modulo4.ProjetoMaven.Ex6_mavenJavadocTest.src.main.java.one.digital.innovation;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args ) {
        User user = new User("Daniele", "123456");
        user.enable();

        System.out.println(user.getStatus());
    }
}
