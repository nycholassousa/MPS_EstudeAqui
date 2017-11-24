/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudeaqui.model;

/**
 *
 * @author nycho
 */
public class Client {

    private String email;
    private String password;
    private final int admin;

    public Client(String email, String password) {
        this.email = email;
        this.password = password;
        this. admin = 0; //Caso seja administrador, o usuário ficará com admin = 1 -> Essa alteração está disponivel apenas via MySQL
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
