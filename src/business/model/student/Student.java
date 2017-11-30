package business.model.student;

import business.control.Validator;
import business.model.answers.AnswersComposite;
import business.model.exceptions.InvalidLoginException;
import business.model.exceptions.LoginValidationException;
import business.model.exceptions.PasswordValidationException;
import business.model.memento.Memento;
import business.model.student.state.*;

public class Student {

    private String email;
    private String password;
    public int admin;
    private AnswersComposite composite;

    //Uso do Padrão State
    private LoginState login;
    private LogoutState logout;
    private StudentState state;

    public Student(String email, String password, int admin, String composite) {
        this.email = email;
        this.password = password;
        this.admin = admin;

        this.composite = new AnswersComposite(this, composite);

        this.login = new LoginState(this);
        this.logout = new LogoutState(this);
        this.state = logout;
    }

    public Student(String email, String password, int admin) {
        this(email, password, admin, "");
    }

    public Student(String email, int admin) {
        this(email, "password", admin, "");
    }

    public Student() {
        this("email", "password", 0, "");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public AnswersComposite getComposite() {
        return composite;
    }

    public StudentState getState() {
        return state;
    }

    public StudentState getLoginState() {
        return this.login;
    }

    public StudentState getLogoutState() {
        return this.logout;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public void setState(StudentState state) {
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

    public void setComposite(AnswersComposite composite) {
        this.composite = (AnswersComposite) composite;
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

    public Memento storeAnswersMemento() throws InvalidLoginException {
        if (state instanceof LoginState) {
            return new Memento(composite);
        } else {
            throw new InvalidLoginException("The student must be logged");
        }
    }

    public boolean login(String email, String password) throws InvalidLoginException {
        if (this.email.equals(email) && this.password.equals(password)) {
            state.login(this.email, this.password);
            return true;
        } else {
            throw new InvalidLoginException();
        }
    }
}
