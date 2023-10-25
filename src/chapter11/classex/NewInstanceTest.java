package chapter11.classex;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // Person 클래스 생성자로 인스턴스 생성
        Person person1 = new Person();
        System.out.println(person1);

        // Class 클래스의 newInstace() 메서드 이용하여 인스턴스 생성
        Class pClass = Class.forName("chapter11.classex.Person");
        Person person2 = (Person) pClass.newInstance();
        System.out.println(person2);
    }
}
