package chapter6.thisex;

class Person {
    String name;
    int age;

    Person() {
        this("이름 없음", 1);
        System.out.println("default 생성자 호출!");
    }

    Person(String name, int age) {
        System.out.println("2번째 생성자 호출!");
        this.name = name;
        this.age = age;
    }

    Person returnItSelf() {
        return this;
    }
}
public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person personThis = noName.returnItSelf();
        System.out.println(personThis);
        System.out.println(noName);
    }
}
