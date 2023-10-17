package chapter5.InformationHiding;

public class MyDate {
    private int day;
    public int month;
    public int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (this.month == 2) {
            if (day < 1 || day > 29) {
                System.out.println("일자 지정 오류입니다.");
                return;
            }
        }

        this.day = day;
    }
}
