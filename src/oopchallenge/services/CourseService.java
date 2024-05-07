package oopchallenge.services;

import oopchallenge.model.Course;
import oopchallenge.model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseService {
    private HashMap<String, Student> students = new HashMap<>();
    private HashMap<String, Course> courses = new HashMap<>();

    public CourseService() {
        // Hardcoded data for demonstration purposes
        students.put("120120", new Student("Santiago", "120120"));
        students.put("884545", new Student("Kate", "884545"));
        students.put("458787", new Student("Alejandra", "458787"));
        students.put("135464", new Student("Maria", "135464"));
        students.put("778979", new Student("Peter", "778979"));

        courses.put("math_01", new Course("Mathematics 1", "math_01", 8));
        courses.put("biol_01", new Course("Biology 1", "biol_01", 8));
        courses.put("phys_01", new Course("Physics 1", "phys_01", 8));
        courses.put("art_01", new Course("Arts 1", "art_01", 8));
        courses.put("chem_01", new Course("Chemistry 1", "chem_01", 8));
        courses.put("sport_01", new Course("Sports 1", "sport_01", 8));
    }

    // Method to add students
    public void addStudent(String id, Student student) {
        students.put(id, student);
    }

    // Method to enroll student in a course
    public void enrollStudent(String studentId, String courseId) {
        // Verify if student and course exist
        if (!students.containsKey(studentId)) {
            throw new StudentNotFoundException("Student not found");
        }
        if (!courses.containsKey(courseId)) {
            throw new CourseNotFoundException("Course not found");
        }

        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        student.enroll(course);
    }

    // Method to unenroll student from a course
    public void unEnrollStudent(String studentId, String courseId) {
        // Verify if student and course exist
        if (!students.containsKey(studentId)) {
            throw new StudentNotFoundException("Student not found");
        }
        if (!courses.containsKey(courseId)) {
            throw new CourseNotFoundException("Course not found");
        }

        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        student.unEnroll(course);
    }

    // Method to display course information
    public void displayCourseInformation(String courseId) {
        // Verify if course exists
        if (!courses.containsKey(courseId)) {
            throw new CourseNotFoundException("Course not found");
        }

        System.out.println(courses.get(courseId));
    }

    // Method to display student information
    public void displayStudentInformation(String studentId) {
        // Verify if student exists
        if (!students.containsKey(studentId)) {
            throw new StudentNotFoundException("Student not found");
        }

        System.out.println(students.get(studentId));
    }

    // Method to show enrolled students in a course
    public void showEnrolledStudents(String courseId) {
        // Verify if course exists
        if (!courses.containsKey(courseId)) {
            throw new CourseNotFoundException("Course not found");
        }

        Course course = courses.get(courseId);
        ArrayList<Student> enrolledStudents = new ArrayList<>();

        for (Student student : students.values()) {
            if (student.getEnrolledCourses().contains(course)) {
                enrolledStudents.add(student);
            }
        }

        System.out.println("Enrolled students in " + course.getName() + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
    }

    // Method to show all courses
    public void showAllCourses() {
        System.out.println("All courses:");
        for (Course course : courses.values()) {
            System.out.println(course);
        }
    }
}