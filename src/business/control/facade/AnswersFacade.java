package business.control.facade;

import business.control.StudentControl;
import business.control.commands.Command;
import business.control.commands.LoginStudentCommand;
import business.control.commands.ShowAnswersCommand;
import business.control.commands.AddAnswerCommand;
import business.control.commands.RemoveAnswerCommand;
import business.model.exceptions.InvalidLoginException;
import business.model.exceptions.InvalidTypeException;
import business.model.exceptions.StudentNotExistException;
import business.model.memento.Caretaker;
import business.model.student.Student;

public class AnswersFacade {

    static private Command command;
    static private Caretaker caretaker = Caretaker.getInstance();

    static public void addAnswer(String email, Object object) throws StudentNotExistException {
        Student student = StudentControl.getStudent(email);
        command = new LoginStudentCommand(student, email);

        try {
            command.execute();

            caretaker.addMemento(student.storeAnswersMemento());

            command = new AddAnswerCommand(student.getComposite(), object);
            command.execute();
        } catch (InvalidLoginException | InvalidTypeException ile) {
            System.out.println(ile.getMessage());
        }
    }

    static public void removeAnswer(String email, Object object) throws StudentNotExistException {

        Student student = StudentControl.getStudent(email);
        command = new LoginStudentCommand(student, email);

        try {
            command.execute();

            caretaker.addMemento(student.storeAnswersMemento());

            command = new RemoveAnswerCommand(student.getComposite(), object);
            command.execute();
        } catch (InvalidLoginException | InvalidTypeException ile) {
            System.out.println(ile.getMessage());
        }

    }
    
    static public void showAnswer(String email) throws StudentNotExistException{
        
        Student student = StudentControl.getStudent(email);
        command = new LoginStudentCommand(student, email);
        
        try{
            command.execute();
            command = new ShowAnswersCommand(student.getComposite());
            command.execute();
        }catch(InvalidLoginException | InvalidTypeException ile){
            System.out.println(ile.getMessage());
        }
        
    }
}
