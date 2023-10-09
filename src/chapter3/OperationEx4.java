package chapter3;

public class OperationEx4 {
    public static void main(String[] args) {

        // 조건 연산자(삼항 연산자)를 이용한 부모님 나이 비교
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch); // F

        int num = 10;
        boolean isEven;

        isEven = (num % 2 == 0) ? true : false;
        System.out.println(isEven);

    }
}
