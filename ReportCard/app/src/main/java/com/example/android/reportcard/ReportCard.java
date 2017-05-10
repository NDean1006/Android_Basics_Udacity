package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class ReportCard {

    private static String school = "Coventry High";
    private String student;
    private String subject;
    private int grade;
    private String semester;

    public ReportCard(String subject, int grade, String semester) {
        this.subject = subject;
        this.grade = grade;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "student='" + student + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                ", semester='" + semester + '\'' +
                '}';
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String course) {
        this.student = course;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String course) {
        this.subject = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String assignGrade(int mark) {


        String grade;

        if (mark > 89 && mark < 101) {
            grade = "A";
        }
        if (mark > 79 && mark < 90) {
            grade = "B";
        }
        if (mark > 69 && mark < 80) {
            grade = "C";
        }
        if (mark > 59 && mark < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }

}
