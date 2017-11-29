package infra.database;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuestionsDAOTest {
    public QuestionsDAOTest() {
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
     * Test of saveQuestionsList method, of class MusicDAO.
     */
    @Test
    public void testBuscar() throws Exception {
        System.out.println("saveQuestionsList");
        QuestionsDAO musicDAO = new QuestionsDAO();
        musicDAO.saveQuestionsList();
    }
}
