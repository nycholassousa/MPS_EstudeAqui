package business.model.student.state;

import business.model.student.Student;

public class LogoutState implements StudentState{
    private Student student;
    
    public LogoutState(Student student){
        this.student = student;
    }
    
    @Override
    public void login(String login, String password) {
        System.out.println("You're logged in your account");
        student.set_state(student.getLoginState());
    }

    @Override
    public void logout() {
        System.out.println("You're already logged out");
    }
}
