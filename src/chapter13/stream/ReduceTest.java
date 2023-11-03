package chapter13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator 인터페이스를 구현한 클래스 정의
class CompareString implements BinaryOperator<String> {

    // reduce() 메서드가 호출될 때 호출되는 apply() 메서드
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~", "hello", "Good Morning", "반갑습니다^^"};

        // 1. BinaryOperator를 구현한 클래스를 사용하는 방법
        String str1 = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str1 + "111");

        // 2. 람다식을 직접 구현하는 방법
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        }) + "222");

        // * 람다식의 내부 구조(익명 내부 클래스)
        BinaryOperator<String> bo = new BinaryOperator<String>() {
            @Override
            public String apply(String s1, String s2) {
                if (s1.getBytes().length >= s2.getBytes().length) return s1;
                else return s2;
            }
        };

        String str2 = Arrays.stream(greetings).reduce(bo).get();
        System.out.println(str2 + "333");
    }
}
