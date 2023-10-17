package chapter6.staticex;

public class Student1 {
    public static int serialNum = 1000;

    private int studentID;
    private String studentName;

    public Student1(String studentName) {
        this.studentName = studentName;
        studentID = serialNum;
        serialNum++;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
