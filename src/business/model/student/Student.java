package business.model.student;

import business.model.exceptions.InvalidLoginException;
import business.model.student.state.*;

public class Student {

    private String email;
    private String password;
    private int admin;
    private LoginState login;
    private LogoutState logout;
    private StudentState state;
    
    public Student(){
        
    }

    public Student(String email, String password, int admin) {
        this.email = email;
        this.password = password;
        this.admin = admin;

        this.login = new LoginState(this);
        this.logout = new LogoutState(this);
        this.state = logout;
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

    public boolean login(String login_argument, String password_argument) throws InvalidLoginException {
        if (this.login.equals(login_argument) && this.password.equals(password_argument)) {
            state.login(email, password);
            return true;
        } else {
            throw new InvalidLoginException();
        }
    }

    public StudentState getLoginState() {
        return this.login;
    }

    public StudentState getLogoutState() {
        return this.logout;
    }

    public void set_state(StudentState state) {
        this.state = state;
    }
}
