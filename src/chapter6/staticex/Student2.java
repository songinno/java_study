package chapter6.staticex;

public class Student2 {
    private static int serialNum = 1000;

    private int studentID;
    private String studentName;

    public Student2(String studentName) {
        this.studentName = studentName;
        studentID = serialNum;
        serialNum++;
    }

    public static int getSerialNum() {
        int i = 10;
//        studentName = "가나다"; // 오류 발생
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
