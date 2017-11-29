package business.model.exceptions;

public class PasswordValidationException extends Exception{
    public PasswordValidationException(){
        super("Error on Validate Password");
    }
    
    public PasswordValidationException(String s){
        super(s);
    }
}
