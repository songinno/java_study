package chapter13.lambda;

public class PrintStringTest {
    public static void main(String[] args) {
        // 인터페이스형 변수에 람다식 대입
        PrintString ps = s -> System.out.println(s);
        ps.showString("hello lambda1");
        // 매개변수로 전달하는 람다식
        PrintString ps2 = s -> System.out.println(s);
        showMyString(ps2);

        // 반환 값으로 쓰이는 람다식
        PrintString ps3 = returnString();
        ps3.showString("hello");
    }

    // 매개변수로 전달하는 람다식
    public static void showMyString(PrintString p) {
        p.showString("hello lambda2");
    }

    // 반환 값으로 쓰이는 람다식
    public static PrintString returnString() {
        return s -> System.out.println(s + " world");
    }

}
