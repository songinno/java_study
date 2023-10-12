package chapter4;

public class Practice1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '*';

        // if-else 문
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/'){
            System.out.println(num1 / num2);
        } else {
            System.out.println("operator값이 [+, -, *, /]에 해당하지 않습니다.");
        }

        // switch-case 문
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
            default:
                System.out.println("operator값이 [+, -, *, /]에 해당하지 않습니다.");
        }

    }
}
