package chapter5;

public class Function {
    public static void main(String[] args) {
        Function f = new Function();
        f.divide(4, 0);
    }

    int getTenTotal() {
        int total = 0;
        for (int i = 1; i < 11; i++) {
            total += i;
        }
        return total;
    }

    void printGreeting(String name) {
        System.out.println(name + "님 안녕하세요.");
    }

    void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("나누는 수는 0이 될 수 없습니다.");
            return;
        } else {
            int result = num1 / num2;
            System.out.println(num1 + " 나누기 " + num2 + "는 " + result + "입니다.");
        }
    }
}
