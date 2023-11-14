package chapter99.report;

import chapter99.grade.BasicEvaluation;
import chapter99.grade.GradeEvaluation;
import chapter99.grade.MajorEvaluation;
import chapter99.school.School;
import chapter99.school.Score;
import chapter99.school.Student;
import chapter99.school.Subject;
import chapter99.util.Define;

import java.util.ArrayList;

public class GenerateReport {
    School school = School.getInstance();
    public static final String TITLE = " 수강색 학점 \t\t\n";
    public static final String HEADER = " 이름 | 학번 | 필수과목 | 점수 \n";
    public static final String LINE = "---------------------\n";

    private StringBuffer buffer = new StringBuffer();

    // 리포트 작성
    public String getReport() {
        ArrayList<Subject> subjectList = school.getSubjectList();

        // 학교에 등록된 과목들 반복문
        for (Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
//            makeFooter();
        }
        return buffer.toString(); // String으로 반환
    }

    public void makeHeader(Subject subject) {
        buffer.append(GenerateReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateReport.TITLE);
        buffer.append(GenerateReport.HEADER);
        buffer.append(GenerateReport.LINE);
    }

    public void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();
        for (Student student : studentList) {
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName());
            buffer.append(" | ");
            // 학생별 수강 과목 학점 계산
            getScoreGrade(student, subject);
            buffer.append("\n");
            buffer.append(GenerateReport.LINE);
        }
    }


    // 학점 계산 메서드
    private void getScoreGrade(Student student, Subject subject) {
        // 특정 과목에 대한 학생의 점수 리스트
        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        // 학점 평가 배열
        GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};
        for (Score score : scoreList) {
            // 현재 과목에 대해서만
            if (subject.getSubjectId() == score.getSubject().getSubjectId()) {
                String grade;
                // 특정 과목이 필수 과목인 경우
                if (subject.getSubjectId() == majorId) {
                    grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                // 특정 과목이 일반 과목인 경우
                } else {
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
                }
                buffer.append(score.getPoint() + ":" + grade);
            }
        }
    }
}
