package chapter4;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        int month = 3;
        int lastDay;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                lastDay = 31;
                break;
            case 2:
                lastDay = 28;
            default:
                lastDay = 30;
        }

        System.out.println(month + "월의 마지막 일자는 " + lastDay + "입니다.");
    }
}
