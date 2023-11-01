package chapter12.practice;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();

        Car sonata1 = factory.createCar("연수 차");
        Car sonata2 = factory.createCar("연수 차");
        sonata1.showCarInfo();
        sonata2.showCarInfo();
        System.out.println(sonata1 == sonata2); // true

        Car avante1 = factory.createCar("승연 차");
        Car avante2 = factory.createCar("승연 차");
        System.out.println(avante1 == avante2); // true
        System.out.println(sonata1 == avante1); // false

        avante1.showCarInfo();
        avante2.showCarInfo();

        System.out.println(factory.getCarMap());

    }
}
