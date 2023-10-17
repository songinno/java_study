package chapter7.arraylist;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student("Lee");
        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);

        Student kim = new Student("Kim");
        kim.addSubject("국어", 70);
        kim.addSubject("수학", 85);
        kim.addSubject("영어", 100);

        lee.showStudentInfo();
        System.out.println("======================");
        kim.showStudentInfo();
    }
}
