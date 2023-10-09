package chapter3;

public class OperationEx3 {
    public static void main(String[] args) {

        // 단락 회로 평가 실습
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value); // false
        System.out.println(num1); // 20
        System.out.println(i); // 2

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value); // true
        System.out.println(num1); // 30
        System.out.println(i); // 2

    }
}
