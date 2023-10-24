package chapter7.arraylist;

public class Subject {
    private String subjectName;
    private int subjectScore;

    public Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectScore() {
        return subjectScore;
    }
}