package chapter6.singletonPractice;

public class Car {
    private static int productNum = 10001;

    private int carNum;

    public Car() {
        this.carNum = productNum;
        productNum++;

    }

    public int getCarNum() {
        return carNum;
    }
}
