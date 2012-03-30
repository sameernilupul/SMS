package org.cse.springtute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    @Override
    public void saveStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);
    }

    @Override
    public void deleteStudent(Student stu) {
        studentsDb.remove(stu.getRegNumber());

    }

    @Override
    public Student findStudent(long regNumber) {

        return studentsDb.get(regNumber);
    }

    @Override
    public void updateStudent(Student stu) {
        this.deleteStudent(stu);
        this.saveStudent(stu);
    }

    @Override
    public List<Student> findAllStudents() {
        Set set = studentsDb.entrySet();
        Iterator it = set.iterator();
        List<Student> students = new ArrayList<Student>();
        while (it.hasNext()) {
            // key=value separator this by Map.Entry to get key and value
            Map.Entry m = (Map.Entry) it.next();

            // getKey is used to get key of Map
            long key = (Long) m.getKey();

            // getValue is used to get value of key in Map
            Student value = (Student) m.getValue();

            
            students.add(value);
        }
        return students;
    }
}
