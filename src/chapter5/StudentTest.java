package chapter5;

public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());

    }
}
