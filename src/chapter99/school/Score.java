package chapter99.school;

public class Score {
    private Student student;
    private Subject subject;
    private int point;

    public Score(Student student, Subject subject, int point) {
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    // getter, setter
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    // toString() 오버라이딩
    @Override
    public String toString() {
        return "학번: " + student.getStudentId() + "," + subject.getSubjectName() + ":" + point;
    }
}
