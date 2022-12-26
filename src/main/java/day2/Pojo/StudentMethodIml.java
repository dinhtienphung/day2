package day2.Pojo;

import java.util.HashMap;
import java.util.Map;

public class StudentMethodIml implements StudentMethod{
    private Map<Long,Student> studentsMap = new HashMap<>();
    {
        Student student = new Student();
        student.setId(1l);
        student.setName("ty");
        student.setClasses("h1");

        studentsMap.put(student.getId(), student);
    }
    @Override
    public void insert(Student student) {
        studentsMap.put(student.getId(), student);
    }

    @Override
    public void update(Student student) {
        studentsMap.put(student.getId(), student);
    }

    @Override
    public Student find(long studentId) {
        return studentsMap.get(studentId);
    }
}
