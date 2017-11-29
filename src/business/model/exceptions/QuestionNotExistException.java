package business.model.exceptions;

public class QuestionNotExistException extends Exception {

    public QuestionNotExistException() {
        super("Error: Question do not exists.");
    }

    public QuestionNotExistException(String s) {
        super(s);
    }
}
