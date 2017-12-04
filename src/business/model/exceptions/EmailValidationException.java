package business.model.exceptions;

public class EmailValidationException extends Exception{
    
    public EmailValidationException(){
        super("Error on Validate Login");
    }
    
    public EmailValidationException(String s){
        super(s);
    }
    
}
