package infra.database;

import business.control.QuestionsControl;
import business.model.questions.Questions;
import infra.database.reader.QuestionsDAOReader;
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
     * Test of loadQuestions method, of class MusicDAO.
     */
    @Test
    public void testBuscar() throws Exception {
        System.out.println("saveQuestionsList");
        QuestionsDAOReader questionsDAO = new QuestionsDAOReader();
        questionsDAO.load();

        for (Questions question : QuestionsControl.questions) {
            System.out.println(question);
        }
    }
}
