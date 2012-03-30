package org.cse.springtute;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 100196E
 */
public class StudentManagementSystemTest {

    private static StudentManagementSystem instance;


    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        instance = new StudentManagementSystem();
    }

    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        instance.listAllStudents();
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student randima = new Student("Randim", "Sandamal", 100446, "Randi Road, Galle, Sri Lanka");
        instance.registerStudent(randima);
        testListAllStudents();
    }
}
