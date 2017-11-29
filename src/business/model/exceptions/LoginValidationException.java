/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model.exceptions;

public class LoginValidationException extends Exception{
    
    public LoginValidationException(){
        super("Error on Validate Login");
    }
    
    public LoginValidationException(String s){
        super(s);
    }
    
}
