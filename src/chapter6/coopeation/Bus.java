package chapter6.coopeation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객 수는 " + passengerCount + "이고, 수입은 " + money + "입니다.");
    }
}
