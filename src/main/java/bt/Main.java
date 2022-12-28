package bt;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansbt/beans.xml");
        Student student = applicationContext.getBean("student", Student.class);

        student.Circle("ty", 2.0);
        student.square("tai", 1.4);
        student.triangle("tam", 2.7);
    }
}
