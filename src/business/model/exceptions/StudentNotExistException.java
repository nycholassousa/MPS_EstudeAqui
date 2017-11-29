package business.model.exceptions;

public class StudentNotExistException extends Exception{
    public StudentNotExistException(){
        super("Error: Student do not exists.");
    }
    
    public StudentNotExistException(String s){
        super(s);
    }
}
