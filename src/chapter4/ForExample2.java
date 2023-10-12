package chapter4;

public class ForExample2 {


    public static void main(String[] args) {
        // 초기화식 생략
        int i = 1;
        int sum = 0;
        for ( ; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 조건식 생략
        int sum2 = 0;
        for (int j = 1; ; j++) {
            sum2 += j;

            if (j >= 10) break;
        }
        System.out.println(sum2);

        // 증감식 생략
        int sum3 = 0;
        for (int k=0; k < 11;) {
            sum3 += k;
            k++;
        }
        System.out.println(sum3);

        // 무한루프
        for ( ; ;) {

        }
    }
}
