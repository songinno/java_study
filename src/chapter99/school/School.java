package chapter99.school;

import java.util.ArrayList;

public class School {
    /* 싱글톤 패턴 */
    // 1. private인 생성자 만들기
    private School() {

    }

    // 2. 클래스 내부에 인스턴스 생성
    public static School instance = new School();

    // 3. 외부에서 사용할 public 메서드
    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    /* 필드 */
    private static String SCHOOL_NAME = "Good School";
    // 등록된 학생 리스트
    private ArrayList<Student> studentList = new ArrayList<>();
    // 과목 리스트
    private ArrayList<Subject> subjectList = new ArrayList<>();

    // 학생 등록 메서드
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // 과목 등록 메서드
    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    // getter, setter
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
