package chapter5.constructor;

public class Person {
    String name;
    float height;
    float weight;

    // 디폴트 생성자
    public Person() {}

    // 이름을 매개변수로 받는 생성자
    public Person(String pname) {
        this.name = pname;
    }

    // 이름, 키, 몸무게를 매개변수로 받는 생성자
    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
