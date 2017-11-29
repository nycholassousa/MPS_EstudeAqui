package business.model.student.state;

import business.model.student.Student;

public class LoginState implements StudentState {

    private Student student;

    public LoginState(Student student) {
        this.student = student;
    }

    @Override
    public void login(String email, String password) {
        System.out.println("You're already logged");
    }

    @Override
    public void logout() {
        System.out.println("You're now logged out");
        student.set_state(student.getLogoutState());
    }
}
