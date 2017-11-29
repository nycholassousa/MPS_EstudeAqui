package business.control.commands;

import business.model.exceptions.InvalidLoginException;
import business.model.student.Student;
import business.model.student.state.LogoutState;
import java.util.Scanner;

public class LoginStudentCommand implements Command {

    private Student user;
    private String login, password;

    public LoginStudentCommand(Student user, String login) {
        this.user = user;
        this.login = login;
    }

    @Override
    public void execute() throws InvalidLoginException {
        if (user.getState()instanceof LogoutState) {
            System.out.println("Erro: the user it is not logged");

            System.out.println("Digit your password");
            try (Scanner scan = new Scanner(System.in)) {
                String inserted_pass = scan.next();
                user.login(login, inserted_pass);
            }
        }
    }
}
