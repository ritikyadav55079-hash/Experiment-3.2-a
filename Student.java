package com.example.springdemo;

public class Student {
    private Course course;

    // Constructor injection
    public Student(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Enrolled in course: " + course.getCourseName());
    }
}
