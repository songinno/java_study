package chapter3;

/* 비트 연산자 */
public class OperationEx5 {
    public static void main(String[] args) {
        // & 연산자
        int result = 3 & 7;
        System.out.println(result);

        // 시프트 연산자
        int num = 0B00000101; // 5를 8비트 2진수로 나타낸 것
        System.out.println(num); // 5

        System.out.println(num << 2); // 00010100 -> 20
        System.out.println(num >> 2); // 00000001 -> 1
        System.out.println(num >>> 2); // 00000001 -> 1
    }
}
