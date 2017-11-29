package business.model.exceptions;

public class InvalidLoginException extends RuntimeException{
    
    public InvalidLoginException(String message){
        super(message);
    }
    
    public InvalidLoginException(){
        this("Error: Invalid Login");
    }
    
}
