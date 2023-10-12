package chapter4;

public class Practice4 {
    public static void main(String[] args) {
        int lineCount = 4;
        int spaceCount = lineCount / 2 + 1; // 양쪽 각각의 공백 개수
        int starCount = 1;

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }

            spaceCount -= 1;
            starCount += 2;
            System.out.println();
        }

    }
}
