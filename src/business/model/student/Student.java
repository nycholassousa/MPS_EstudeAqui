package business.model.student;

import business.control.Validator;
import business.model.exceptions.InvalidLoginException;
import business.model.exceptions.LoginValidationException;
import business.model.exceptions.PasswordValidationException;
import business.model.student.state.*;

public class Student {

    private String email;
    private String password;
    private int admin;
    private LoginState login;
    private LogoutState logout;
    private StudentState state;

    public Student() {

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

    public String getPassword() {
        return password;
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

    public void setEmail(String email) {
        try {
            Validator.validateEmail(email);
            this.email = email;
        } catch (LoginValidationException uve) {
            System.out.println(uve.getMessage());
        }
    }

    public void setPassword(String password) {
        try {
            Validator.validatePassword(password);
            this.password = password;
        } catch (PasswordValidationException uve) {
            System.out.println(uve.getMessage());
        }
    }

    public String getInfo() {
        return "Email: " + this.email + "\nPassword: " + this.password;
    }
}
