package business.control.facade;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegisterFacadeTest {

    public RegisterFacadeTest() {
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
     * Test of createQuestion method, of class RegisterFacade.
     */
    @Test
    public void testCreateQuestion() {
        System.out.println("createQuestion");
        try {
            RegisterFacade.createQuestion(1); //Criar Questão importando de um arquivo JSON
            RegisterFacade.createQuestion(2); //Criar Questão importando de um arquivo CSV
        } catch (Exception e) {
            fail();
        }
    }

    /**
     * Test of createStudent method, of class RegisterFacade.
     */
    @Test
    public void testCreateStudent() {
        System.out.println("createStudent");
        //TODO
    }

}
