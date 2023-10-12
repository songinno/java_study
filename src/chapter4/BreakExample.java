package chapter4;

public class BreakExample {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; ; i++) {
            total += i;
            if (total > 100) {
                System.out.println(i);
                break;
            }
        }
    }
}