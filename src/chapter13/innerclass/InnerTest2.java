package chapter13.innerclass;
/* 다른 클래스에서의 인스턴스 내부 클래스 생성 예제 */
class OutClass2 {
    public InClass2 inClass = new InClass2();

    class InClass2 {
        void inTest() {
            System.out.println("inTest() 메서드 호출");
        }
    }
}

public class InnerTest2 {
    public static void main(String[] args) {
        OutClass2 outClass = new OutClass2();
        OutClass2.InClass2 inClass = outClass.new InClass2();
        inClass.inTest();
    }
}
