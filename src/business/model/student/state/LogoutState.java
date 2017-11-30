package business.model.student.state;

import business.model.student.Student;

public class LogoutState implements StudentState {

    private Student student;

    public LogoutState(Student student) {
        this.student = student;
    }

    @Override
    public void login(String email, String password) {
        System.out.println("You're logged in your account");
        student.setState(student.getLoginState());
    }

    @Override
    public void logout() {
        System.out.println("You're already logged out");
    }
}
