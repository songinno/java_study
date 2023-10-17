package chapter7.arraylist;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private static int serialNum = 1001;

    private int studentID;

    private ArrayList<Subject> subjectList;

    public Student(String studentName) {
        this.studentName = studentName;
        this.subjectList = new ArrayList<Subject>();
        this.studentID = serialNum;
        serialNum++;
    }

    // 학생이 수강하는 과목을 추가하는 메서드
    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject(subjectName, score);
        this.subjectList.add(subject);
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

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void showStudentInfo() {
        int totalScore = 0;
        for (Subject sub : subjectList) {
            System.out.println("학생 " + studentName + "의 " + sub.getSubjectName() + " 과목 성적은 " + sub.getSubjectScore() + "입니다.");
            totalScore += sub.getSubjectScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + totalScore + "입니다.");
    }
}
