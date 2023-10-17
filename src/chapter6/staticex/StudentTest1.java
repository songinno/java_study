package chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("홍길동");

        System.out.println(student1.getStudentID());
        System.out.println(student1.getStudentName());

        Student1 student2 = new Student1("임꺽정");

        System.out.println(student2.getStudentID());
        System.out.println(student2.getStudentName());
    }
}
