package one.digitalinnovation.modulo4.ProjetoMaven.Ex6_mavenJavadocTest.src.main.java.one.digital.innovation;

/**
 * Classe que representa o usuario
 */

public class User {

    private String username;
    private String password;
    private StatusUser status;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StatusUser getStatus() {
        return status;
    }

    public void setStatus(StatusUser status) {
        this.status = status;
    }

    /**
     * Desabilita o usuario informando e setando o status DISABLED
     */
    public void disable(){
        this.status = StatusUser.DISABLED;
    }

    /**
     * Habilita o usuario informando e setando o status ENABLED
     */
    public void enable(){
        this.status = StatusUser.ENABLED;
    }
}
