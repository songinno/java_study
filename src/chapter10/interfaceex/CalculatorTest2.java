package chapter10.interfaceex;

public class CalculatorTest2 {
    public static void main(String[] args) {

        Calc calc1 = new CompleteCalc();
        Calculator calc2 = new CompleteCalc();
        CompleteCalc calc3 = new CompleteCalc();
        calc3.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
