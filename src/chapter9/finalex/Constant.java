package chapter9.finalex;

public class Constant {
    int num = 10;
    // 상수 선언
    final int NUM = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
//        cons.NUM = 1000; // 오류 발생

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
