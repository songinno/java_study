package chapter13.practice;

public class CalcTest {
    public static void main(String[] args) {
        Calc sum = (x, y) -> x + y;
        int total = sum.add(10, 20);
        System.out.println(total);
    }
}
