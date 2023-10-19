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

}
