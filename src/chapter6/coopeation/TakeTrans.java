package chapter6.coopeation;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        System.out.println("-----------");

        Subway subwayGreen = new Subway(2);
        tomas.takeSubway(subwayGreen);
        tomas.showInfo();
        subwayGreen.showInfo();

        System.out.println("-----------");

        james.takeSubway(subwayGreen);
        james.showInfo();
        subwayGreen.showInfo();
    }
}
