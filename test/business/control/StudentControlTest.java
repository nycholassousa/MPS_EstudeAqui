package business.control;

import business.model.student.Student;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentControlTest {

    private ArrayList<Student> collection;

    public StudentControlTest() {
        collection = new ArrayList<Student>();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        collection = new ArrayList<Student>();
    }

    @After
    public void tearDown() {
        collection.clear();
    }

    /**
     * Test of addStudent method, of class StudentControl.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");

        String email1 = "Nycholas";
        String email2 = "Victor";
        String email3 = "Raoni";

        String password1 = "123";
        String password2 = "456";
        String password3 = "789";

        Student student1 = new Student(email1, password1, 0);
        Student student2 = new Student(email2, password2, 0);
        Student student3 = new Student(email3, password3, 1);

        collection.add(student1);
        collection.add(student2);
        collection.add(student3);

        StudentControl.addStudent(email1, password1, 0);
        StudentControl.addStudent(email2, password2, 0);
        StudentControl.addStudent(email3, password3, 1);
    }
}
