package com.student;

public class StudentResult {
    public static void main(String[] args) {
        String studentName = "NIDEESH CG";
        String registerNumber = "23MIC0092";
        String courseName = "Computer Science";
        String subjectName = "Application Development and Deployment Architecture";
        int marks = 85;
        String grade = "A";
        int totalMarks = 100;
        String resultStatus = (marks >= 40) ? "Pass" : "Fail";

        System.out.println("Student Name: " + studentName);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Course Name: " + courseName);
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Marks: " + marks + "/" + totalMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Result Status: " + resultStatus);
        System.out.println("Result Build Successful");
    }
}
