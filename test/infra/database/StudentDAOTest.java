package infra.database;

import infra.database.reader.StudentDAOReader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentDAOTest {
    public StudentDAOTest() {
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
     * Test of loadStudents method, of class UserDAO.
     */
    @Test
    public void testBuscar() throws Exception {
       StudentDAOReader userdao = new StudentDAOReader();
       userdao.loadStudents();
    }
}
