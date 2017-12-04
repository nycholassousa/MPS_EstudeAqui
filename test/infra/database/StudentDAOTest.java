package infra.database;

import business.control.StudentControl;
import business.model.student.Student;
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
       StudentDAOReader studentDAO = new StudentDAOReader();
       studentDAO.load();
       
       for (Student student : StudentControl.studentsList) {
            System.out.println(student);
        }
    }
}
