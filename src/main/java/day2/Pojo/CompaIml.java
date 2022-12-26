package day2.Pojo;

public class CompaIml implements Compa{
    private StudentMethod studentMethod;

    public void  setStudentMethod(StudentMethod studentMethod) {
        this.studentMethod = studentMethod;
    }

    @Override
    public void drawCircle(long id, String name, double bk) {
        Student student = studentMethod.find(id);
        System.out.println("đang vẽ hình tròn bán kính" +student.getId()+ " là " +bk );
    }

    @Override
    public Student getStudent(long studentId) {
        return studentMethod.find(studentId);
    }

}
