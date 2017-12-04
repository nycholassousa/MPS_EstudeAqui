package business.model.exceptions;

public class InvalidEmailException extends RuntimeException{
    
    public InvalidEmailException(String message){
        super(message);
    }
    
    public InvalidEmailException(){
        this("Error: Invalid Login");
    }
    
}
