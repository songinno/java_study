package chapter13.lambda;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(1,10));
    }
}
