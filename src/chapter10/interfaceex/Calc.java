package chapter10.interfaceex;

public interface Calc {
    // 상수 선언
    double PI = 3.14;
    int ERROR = -999999999;

    // 추상 메서드 선언
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 디폴트 메서드
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
        myStaticMethod();
    }

    // 정적 메서드
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
//        myMethod(); // 정적 메서드에서 그냥 private 메서드는 호출 불가
        myStaticMethod();
        return total;
    }

    // private 메서드
    private void myMethod() {
        System.out.println("private 메서드 입니다.");
    }

    private static void myStaticMethod() {
        System.out.println("private static 메서드 입니다.");
    }

}
