package chapter5;

public class Person2 {
    int age;
    String name;
    boolean married;
    int childrenCount;

    public static void main(String[] args) {
        Person2 person = new Person2();
        person.age  = 40;
        person.name = "James";
        person.married = true;
        person.childrenCount = 3;

        System.out.println("나이: " + person.age);
        System.out.println("이름: " + person.name);
        System.out.println("결혼 여부: " + person.married);
        System.out.println("자녀 수: " + person.childrenCount);
    }
}
