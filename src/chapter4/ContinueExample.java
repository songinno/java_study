package chapter4;

public class ContinueExample {
    public static void main(String[] args) {
        // 1 ~ 100까지 수에서 홀수만 더하기
        int total = 0;
        int num;

        for (num = 1; num < 101; num++) {
            if (num % 2 == 0) continue;
            total += num;
        }
        System.out.println(total);

        // 1 ~ 100까지 수 중, 3의 배수만 출력
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) System.out.println(i);
        }
    }
}
