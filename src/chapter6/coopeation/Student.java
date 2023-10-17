package chapter6.coopeation;

public class Student {
    // 멤버 변수
    public String studentName;
    public int grade;
    public int money;

    // 생성자
    public Student(String name, int money) {
        this.studentName = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + "의 남은 돈은 " + money + "입니다.");
    }

}
