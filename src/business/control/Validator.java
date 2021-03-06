package business.control;

import business.model.exceptions.EmailValidationException;
import business.model.exceptions.PasswordValidationException;

public class Validator {

    public static boolean validateEmail(String email) throws EmailValidationException {
        int size = email.length();
        if (size > 20) {
            throw new EmailValidationException("Email invalido: comprimento superior a 20");
        }
        if (email.equals("")) {
            throw new EmailValidationException("Email invalido: email vazio");
        }

        return true; //Usado para o teste unitario
    }

    public static boolean validatePassword(String password) throws PasswordValidationException {
        int size = password.length();
        if ((size > 32 || size < 8) && !password.matches("[\\w\\d]*\\d[\\w\\d]*\\d[\\w\\d]*")) {
            throw new PasswordValidationException("Password invalido: comprimento invalido e deve possuir pelo menos 2 digitos");
        }
        if (size > 32 || size < 8) {
            throw new PasswordValidationException("Password invalido: comprimento invalido");
        }
        if (!password.matches("[\\w\\d]*")) {
            throw new PasswordValidationException("Password invalido: senha composta por caracteres invalidos");
        }
        if (!password.matches("[\\w\\d]*\\d[\\w\\d]*\\d[\\w\\d]*")) {
            throw new PasswordValidationException("Password invalido: deveria conter pelo menos 2 digitos");
        }
        if (!password.matches("[\\w\\d]*[a-zA-Z][\\w\\d]*")) {
            throw new PasswordValidationException("Password invalido: deveria conter pelo menos 1 letra");
        }

        return true; //Usado para o teste unitario
    }
}
