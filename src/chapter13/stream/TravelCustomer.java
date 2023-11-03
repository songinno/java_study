package chapter13.stream;

public class TravelCustomer {
    // 필드
    private String name; // 이름
    private int age; // 나이
    private int price; // 가격

    // 생성자
    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    // toString()
    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", price: " + price;
    }
}
