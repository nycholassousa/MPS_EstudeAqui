/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model.exceptions;

/**
 *
 * @author Joao
 */
public class InvalidLoginException extends RuntimeException{
    
    public InvalidLoginException(String message){
        super(message);
    }
    
    public InvalidLoginException(){
        this("Erro: Invalid Login");
    }
    
}
