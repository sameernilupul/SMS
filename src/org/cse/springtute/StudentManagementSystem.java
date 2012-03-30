package org.cse.springtute;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

	private StudentRepository repo;

    public StudentManagementSystem() {
        repo =new SimpleStudentRepository();
    }

	public void listAllStudents() {

            List<Student> l = repo.findAllStudents();
            for(int i=0;i<l.size();i++)
            {
                System.out.println(l.get(i).toString());
            }

	}

	public void registerStudent(Student stu){
		repo.saveStudent(stu);
	}
}
