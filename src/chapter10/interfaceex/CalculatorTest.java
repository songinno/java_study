package chapter10.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        calc.showInfo();

        System.out.println("======================");
        Calc calc2 = new CompleteCalc();
        System.out.println(calc2.add(1,3));

        Calculator calc3 = new CompleteCalc();
        System.out.println(calc3.add(4,5));
    }
}
