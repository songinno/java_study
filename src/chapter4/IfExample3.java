package chapter4;

/* 조건 연산자 */
public class IfExample3 {
    public static void main(String[] args) {

        int score = 90;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else {
            grade = 'B';
        }
        System.out.println(grade);

        grade = (score >= 90) ? 'A' : 'B';
        System.out.println(grade);

    }
}
