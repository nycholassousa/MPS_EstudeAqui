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
            RegisterFacade.createQuestion(1, "import.json");
            RegisterFacade.createQuestion(2, "import.json");
        } catch (Exception e) {
            fail();
        }
    }

    /**
     * Test of registerStudent method, of class RegisterFacade.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        //TODO
    }

}
