package business.control.facade;

import business.control.StudentControl;
import business.control.commands.Command;
import business.control.commands.LoginStudentCommand;
import business.control.commands.ShowAnswersCommand;
import business.control.commands.AddAnswerCommand;
import business.control.commands.RemoveAnswerCommand;
import business.model.answers.AnswersComponent;
import business.model.exceptions.InvalidLoginException;
import business.model.exceptions.InvalidTypeException;
import business.model.exceptions.StudentNotExistException;
import business.model.memento.Caretaker;
import business.model.student.Student;

public class AnswersFacade {

    static private Command command;
    static private AnswersComponent component;
    static private Caretaker caretaker = Caretaker.getInstance();

    static public void addAnswer(String email, Object object) throws StudentNotExistException {
        Student user = StudentControl.getStudent(email);
        command = new LoginStudentCommand(user, email);

        try {
            command.execute();

            caretaker.addMemento(user.storeAnswersMemento());

            command = new AddAnswerCommand(user.getComposite(), object);
            command.execute();
        } catch (InvalidLoginException ile) {
            System.out.println(ile.getMessage());
        } catch (InvalidTypeException ite) {
            System.out.println(ite.getMessage());
        }
    }

    static public void removeAnswer(String email, Object object) throws StudentNotExistException {

        Student user = StudentControl.getStudent(email);
        command = new LoginStudentCommand(user, email);

        try {
            command.execute();

            caretaker.addMemento(user.storeAnswersMemento());

            command = new RemoveAnswerCommand(user.getComposite(), object);
            command.execute();
        } catch (InvalidLoginException ile) {
            System.out.println(ile.getMessage());
        } catch (InvalidTypeException ite) {
            System.out.println(ite.getMessage());
        }

    }
    
    static public void showAnswer(String email) throws StudentNotExistException{
        
        Student user = StudentControl.getStudent(email);
        command = new LoginStudentCommand(user, email);
        
        try{
            command.execute();
            command = new ShowAnswersCommand(user.getComposite());
            command.execute();
        }catch(InvalidLoginException ile){
            System.out.println(ile.getMessage());
        }catch(InvalidTypeException ite){
            System.out.println(ite.getMessage());
        }
        
    }
}
