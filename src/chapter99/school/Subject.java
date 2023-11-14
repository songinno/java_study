package chapter99.school;

import chapter99.util.Define;

import java.util.ArrayList;

public class Subject {
    // 과목 이름
    private String subjectName;
    // 과목 고유 번호
    private int subjectId;
    // 학점 평가 정책
    private int gradeType;
    // 과목을 수강하는 학생 리스트
    ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        // 기본 학점 평가 정책 - AB_TYPE
        this.gradeType = Define.AB_TYPE;
    }

    // 수강 신청 메서드
    public void register(Student student) {
        studentList.add(student);
    }

    // getter,setter
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
