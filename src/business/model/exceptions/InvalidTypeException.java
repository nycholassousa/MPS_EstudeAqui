package business.model.exceptions;

public class InvalidTypeException extends RuntimeException{
    
    public InvalidTypeException(){
        super("Error: Invalid Type");
    }
    
    public InvalidTypeException(String s){
        super(s);
    }
    
}
