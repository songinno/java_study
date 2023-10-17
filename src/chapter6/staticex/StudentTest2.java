package chapter6.staticex;

public class StudentTest2 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("홍길동");

        System.out.println(Student1.serialNum);

        Student1 student2 = new Student1("임꺽정");

        System.out.println(Student1.serialNum);
    }
}
