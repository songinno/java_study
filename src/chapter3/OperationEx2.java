package chapter3;

public class OperationEx2 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = ++gameScore;
        System.out.println(lastScore1);

        int lastScore2 = --gameScore;
        System.out.println(lastScore2);

        int val = 10;
//        int num = ++val;
        int num = val++;
        System.out.println(num);

    }
}
