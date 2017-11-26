package estudeaqui.model;

public class Student {

    private String email;
    private String password;
    private final int admin;

    public Student(String email, String password) {
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
