package business.model.exceptions;

public class LoginValidationException extends Exception{
    
    public LoginValidationException(){
        super("Error on Validate Login");
    }
    
    public LoginValidationException(String s){
        super(s);
    }
    
}
