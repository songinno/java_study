package chapter2;

public class TypeInferenceEx2 {
    public static void main(String[] args) {
        var str = "hello";

        str = "byebye"; // 다른 문자열은 대입 가능

        // str = 10; // 다른 타입의 값은 대입 불가
    }
}
