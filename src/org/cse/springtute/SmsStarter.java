package org.cse.springtute;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

	public static void main(String[] args) {

            ClassPathXmlApplicationContext context;
            context = new ClassPathXmlApplicationContext("spring-context.xml");
            context.start();

            StudentManagementSystem sms = (StudentManagementSystem) context.getBean("sms");
            sms.listAllStudents();
            Student randima = new Student("Randim", "Sandamal", 100446, "Randi Road, Galle, Sri Lanka");
            Student shamika = new Student("Shamika", "Gunathunga", 100223, "Dr. Shamika Mawatha, Panadura");
            
            sms.registerStudent(randima);
            sms.registerStudent(shamika);
            sms.listAllStudents();
	}
}
