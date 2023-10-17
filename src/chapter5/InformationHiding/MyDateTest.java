package chapter5.InformationHiding;

public class MyDateTest {

    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.year = 2023;
        date.month = 2;
        date.setDay(31);
        System.out.println(date.getDay());

        date.setDay(28);
        System.out.println(date.getDay());

    }
}
