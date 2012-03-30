package org.cse.springtute;

import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleStudentRepositoryTest {

    public SimpleStudentRepositoryTest() {
    }
   static SimpleStudentRepository instance ;
   static Student randima ;
   static Student shamika ;
    @BeforeClass
    public static void setUpClass() throws Exception {
       instance = new SimpleStudentRepository();
       randima = new Student("Randim", "Sandamal", 100446, "Randi Road, Galle, Sri Lanka");
       shamika = new Student("Shamika", "Gunathunga", 100223, "Dr. Shamika Mawatha, Panadura");
    }

    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        instance.saveStudent(randima);
        instance.saveStudent(shamika);

    }

    /**
     * Test of deleteStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        instance.deleteStudent(randima);
    }

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        Student result=instance.findStudent(100223);
        Student expResult= shamika;
        assertEquals(expResult, result);

    }

    /**
     * Test of updateStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        shamika.setAddress("123 parana para Panadura");
        instance.updateStudent(shamika);
    }


    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        List result = instance.findAllStudents();
    }
}
