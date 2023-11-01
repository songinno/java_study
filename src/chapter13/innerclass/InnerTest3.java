package chapter13.innerclass;

/* 정적 내부 클래스 예제 */
class OutClass3 {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        // 정적 내부 클래스의 일반 메서드
        void inTest() {
//            num += 10; // 외부 클래스의 인스턴스 변수는 사용 불가
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
        }

        // 정적 내부 클래스의 정적 메서드
        static void sInTest() {
//            num += 10;
//            inNum += 10; // 외부, 내부 모두의 인스턴스 변수 사용 불가
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
        }
    }

}


public class InnerTest3 {
    public static void main(String[] args) {
        OutClass3.InStaticClass sInClass = new OutClass3.InStaticClass(); // 외부 클래스 생성 필요 없이, 바로 정적 내부 클래스 생성
        System.out.println("정적 내부 클래스 - 일반 메서드 호출");
        sInClass.inTest();

        System.out.println("========================");

        System.out.println("정적 내부 클래스 - 정적 메서드 호출");
        OutClass3.InStaticClass.sInTest(); // 정적 내부 클래스 생성 필요 없이, 바로 정적 메서드 호출



    }
}
