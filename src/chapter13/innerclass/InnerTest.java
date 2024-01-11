package chapter13.innerclass;
/* 인스턴스 내부 클래스 예제 */
class OutClass { // 외부 클래스
    private int num = 10; // 외부 클래스 private 변수
    private static int sNum = 20; // 외부 클래스 정적 변수

    // 내부 클래스 자료형 변수 선언
    private InClass inClass;

    // 외부 클래스 디폴트 생성자
    public OutClass() {
        inClass = new InClass();
    }

    class InClass { // 인스턴스 내부 클래스
        int inNum = 100; // 내부 클래스의 인스턴스 변수
//        static int sInNum = 200; // 오류 발생 - 인스턴스 내부 클래스에 정적 변수 선언 불가
        static final int sfInNum = 1000; // static final 변수(상수)는 선언 가능

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }

//        static void sInTest() {} // 오류 발생 - 인스턴스 내부 클래스에 정적 메서드 정의 불가
    }
    public void usingClass() {
        inClass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();

        System.out.println(OutClass.InClass.sfInNum);;
    }
}
