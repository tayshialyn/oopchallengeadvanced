package oopchallenge;

import oopchallenge.services.CourseService;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();

        // Enroll students in courses
        courseService.enrollStudent("120120", "math_01");
        courseService.enrollStudent("884545", "math_01");
        courseService.enrollStudent("135464", "biol_01");
        courseService.enrollStudent("778979", "art_01");

        // Display course information
        courseService.displayCourseInformation("math_01");

        // Display student information
        courseService.displayStudentInformation("884545");

        // Display enrolled students in a course
        courseService.showEnrolledStudents("math_01");

        // Display all courses
        courseService.showAllCourses();
    }
}

        // commented out as can just use CourseService to do the job
//        Student studentA = new Student("John Doe","101");
////        Student studentB = new Student();   // calls upon the overloaded constructor which is empty)
//
//        // create course details
//        Course courseA = new Course("Math", "01", "2");
//        Course courseB = new Course("Science", "02", "3");
//
////        studentB.setName("Sam Smith");
////        studentB.setId("102");
////
////        System.out.println(studentA);  // prints both name and ID of students
////        System.out.println(studentB);
////        System.out.println(studentB.getName()); //  print Student B's name ONLY
//
//        // enroll students into courses
//        studentA.enroll(courseA);
//        studentA.enroll(courseB);
//        System.out.println(studentA.getEnrolledCourses());
//
//        studentA.unEnroll(courseA);
//        System.out.println(studentA.getEnrolledCourses());
