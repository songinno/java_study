package chapter4;

public class Practice2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) continue;
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
