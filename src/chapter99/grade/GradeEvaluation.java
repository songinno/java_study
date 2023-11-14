package chapter99.grade;

import chapter99.school.Score;

@FunctionalInterface
public interface GradeEvaluation {
    public String getGrade(int point);
}
