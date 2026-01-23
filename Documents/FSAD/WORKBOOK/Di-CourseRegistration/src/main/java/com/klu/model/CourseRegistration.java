package com.klu.model;

public class CourseRegistration {
    private int rollNo;
    private String studentName;
    private String courseName;
    private String semester;

    // Constructor Injection
    public CourseRegistration(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    // Setter Injection
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + studentName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Semester: " + semester);
    }
}
