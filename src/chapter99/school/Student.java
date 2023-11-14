package chapter99.school;

import java.util.ArrayList;

public class Student {
    // 학번
    private int studentId;
    // 이름
    private String studentName;
    // 전공 과목
    private Subject majorSubject;
    // 수강한 과목의 점수 리스트
    private ArrayList<Score> scoreList = new ArrayList<>();

    // 생성자 - 매개변수 : 학번, 이름, 전공 과목
    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    // 점수 리스트에 점수를 추가하는 메서드
    public void addScore(Score score) {
        scoreList.add(score);
    }

    // getter, setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
