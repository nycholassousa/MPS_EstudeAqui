package business.control.commands;

import business.model.exceptions.InvalidLoginException;
import business.model.student.Student;
import business.model.student.state.LogoutState;
import java.util.Scanner;

public class LoginStudentCommand implements Command {

    private Student student;
    private String email, password;

    public LoginStudentCommand(Student student, String email) {
        this.student = student;
        this.email = email;
    }

    @Override
    public void execute() throws InvalidLoginException {
        if (student.getState()instanceof LogoutState) {
            System.out.println("Erro: the student it is not logged");

            System.out.println("Digit your password");
            try (Scanner scan = new Scanner(System.in)) {
                String inserted_pass = scan.next();
                student.login(email, inserted_pass);
            }
        }
    }
}
