package chapter4;

public class ForExample {


    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
        }

        for (int i = 1; i != 11; i++) {
            sum2 += i;
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}
