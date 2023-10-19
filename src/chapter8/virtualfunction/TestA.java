package chapter8.virtualfunction;

public class TestA {
    int num;

    void aaa() {
        System.out.println("aaa() 메서드 호출");
    }

    public static void main(String[] args) {
        TestA a1 = new TestA();
        TestA a2 = new TestA();

        a1.aaa();
        a2.aaa();
    }
}
