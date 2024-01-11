package chapter12.practice;

import java.util.HashMap;

public class CarFactory {
    // 필드
    HashMap<String, Car> carMap = new HashMap<>();
    private static int serialNum = 1000;

    // 1. 생성자를 private으로 만들기
    private CarFactory(){}

    // 2. 클래스 내부에 static으로 유일한 인스턴스 생성
    public static CarFactory carFactory = new CarFactory();

    // 3. 외부에서 참조할 수 있는 public 메서드 생성
    public static CarFactory getInstance() {
        if (carFactory == null) {
            carFactory = new CarFactory();
        }
        return carFactory;
    }

    // 메서드
    public Car createCar(String carName) {
        if (carMap.containsKey(carName)) {
            return carMap.get(carName);
        }
        Car car = new Car(carName, serialNum);
        serialNum++;
        carMap.put(carName, car);
        return car;
    }

    // 확인을 위해 getter
    public HashMap<String, Car> getCarMap() {
        return carMap;
    }
}
