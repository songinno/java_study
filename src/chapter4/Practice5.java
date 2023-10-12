package chapter4;

public class Practice5 {
    public static void main(String[] args) {
        int lineCount = 7;
        int spaceCount = 3; // 양쪽 각각의 공백 개수
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

            if (i <= 2) {
                spaceCount -= 1;
                starCount += 2;
            } else {
                spaceCount += 1;
                starCount -= 2;
            }
            System.out.println();
        }

    }
}
