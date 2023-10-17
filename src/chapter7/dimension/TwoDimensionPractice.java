package chapter7.dimension;

public class TwoDimensionPractice {
    public static void main(String[] args) {
        char ch = 'a';

        char[][] alphabetArray = new char[13][2];

        for (int i = 0; i < alphabetArray.length; i++) {
            for (int j = 0; j < alphabetArray[i].length; j++, ch++) {
                alphabetArray[i][j] = ch;
                System.out.print(alphabetArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
