package estudeaqui.model;

public class Student {

    

    private String email;
    private String password;
    private int admin;

    private Student(String email, String password, int admin) {
        this.email = email;
        this.password = password;
        this.admin = admin; //Caso seja administrador, o usuário ficará com admin = 1 -> Essa alteração está disponivel apenas via MySQL
    }
    
    private static Student createStudent(String email, String password, int admin) {
        return new Student(email, password, admin);
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

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

}
