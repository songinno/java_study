package chapter4;

public class WhileExample {
    public static void main(String[] args) {
        int num = 1;
        int total = 0;
        while (num < 11) {
            total += num;
            num++;
        }
        System.out.println(total);
    }

}
