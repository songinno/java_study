package chapter6.coopeation;

public class Subway {
    int lineNumber;

    int passengerCount;

    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(lineNumber + "번 버스의 승객 수는 " + passengerCount + "이고, 수입은 " + money + "입니다.");
    }
}
