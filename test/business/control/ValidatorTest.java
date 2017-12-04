package business.control;

import business.model.exceptions.EmailValidationException;
import business.model.exceptions.PasswordValidationException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidatorTest {

    public ValidatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validateEmail method, of class Validator.
     */
    @Test
    public void testValidateEmail() throws Exception {
        System.out.println("validateEmail");

        String validEmail1 = "Nycholas";
        String validEmail2 = "Victor";
        String validEmail3 = "Raoni";

        String invalidEmail1 = "Nycholas de Sousa ababababababab"; //Comprimento maior do que 20
        String invalidEmail2 = ""; //String vazia

        assertTrue(Validator.validateEmail(validEmail1));
        assertTrue(Validator.validateEmail(validEmail2));
        assertTrue(Validator.validateEmail(validEmail3));

        try {
            Validator.validateEmail(invalidEmail1);
            fail("LoginValidationException occurs here");
        } catch (EmailValidationException lve) {
        }

        try {
            Validator.validateEmail(invalidEmail2);
            fail("LoginValidationException occurs here");
        } catch (EmailValidationException lve) {
        }
    }

    /**
     * Test of validatePassword method, of class Validator.
     */
    @Test
    public void testValidatePassword() throws Exception {
        System.out.println("validatePassword");

        String validPass1 = "H3LL0W0RLD";
        String validPass2 = "H3110W0R1D";
        String validPass3 = "OLAMUNDO123";

        String invalidPass1 = "H3LL0 W0RLD"; //Caractere Inválido
        String invalidPass2 = "HelloWorld"; //Senha < 2 dígitos
        String invalidPass3 = "123456789"; //Senha não possui letra
        String invalidPass4 = "T3RR4"; //Senha com comprimento menor que 8

        assertTrue(Validator.validatePassword(validPass1));
        assertTrue(Validator.validatePassword(validPass2));
        assertTrue(Validator.validatePassword(validPass3));

        try {
            Validator.validatePassword(invalidPass1);
            fail("PasswordValidationException occurs here");
        } catch (PasswordValidationException lve) {
        }

        try {
            Validator.validatePassword(invalidPass2);
            fail("PasswordValidationException occurs here");
        } catch (PasswordValidationException lve) {
        }

        try {
            Validator.validatePassword(invalidPass3);
            fail("PasswordValidationException occurs here");
        } catch (PasswordValidationException lve) {
        }

        try {
            Validator.validatePassword(invalidPass4);
            fail("PasswordValidationException occurs here");
        } catch (PasswordValidationException lve) {
        }
    }

}
