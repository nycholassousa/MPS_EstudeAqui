/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model.exceptions;

/**
 *
 * @author joao
 */
public class PasswordValidationException extends Exception{
    public PasswordValidationException(){
        super("Error on Validate Password");
    }
    
    public PasswordValidationException(String s){
        super(s);
    }
}