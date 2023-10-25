package chapter11.string;

public class WrapperTest {
    public static void main(String[] args) {
        Integer iValue = new Integer(100);
        int myValue = iValue.intValue();
        System.out.println(myValue);

        Integer num1 = Integer.valueOf(100);
        Integer num2 = Integer.valueOf("100");

        int num = Integer.parseInt("100");

        // 오토박싱, 언박싱 (Java5 ~)
        Integer number1 = new Integer(100);
        int number2 = 200;
        int sum = number1 + number2; // number1.intValue()로 int 타입으로 변환 - 언박싱
        Integer number3 = sum; // Integer.valueOf(sum)로 Integer 타입으로 변환 - 오토박싱
    }
}
