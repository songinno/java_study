package chapter12.practice;

public class Car {
    String name;
    int carId;

    public Car() {

    }

    public Car(String name, int carId) {
        this.name = name;
        this.carId = carId;
    }

    public void showCarInfo() {
        System.out.println("this: " + this);
        System.out.println("carName: " + name);
        System.out.println("carId: " + carId);
    }

}
