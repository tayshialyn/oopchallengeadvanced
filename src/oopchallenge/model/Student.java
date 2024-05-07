// Student.java
package oopchallenge.model;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Course> enrolledCourses = new ArrayList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Enroll and unenroll methods
    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    public void unEnroll(Course course) {
        enrolledCourses.remove(course);
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + '}';
    }
}