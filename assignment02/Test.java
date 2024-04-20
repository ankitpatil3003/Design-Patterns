package assignment02;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create a person
        Person person = new Person("John Doe", "103 Main St", "Bing", "13905", "USA", "1990-02-01");

        // Create a ConcreteStudent
        AbstractStudent student = new ConcreteStudent(person);
        student.setUniversity("Example University");

        // Create and add decorators
        student = new CourseDecorator(student, "CS", "101", "Intro to CS", 3, "01", "A");
        student = new DomesticStudentDecorator(student, "USA");
        student = new GraduateDecorator(student);
        student = new InternationalStudentDecorator(student, "F1");

        // Test getters and setters
        System.out.println("Name: " + student.getInnerSelf().getName());
        System.out.println("University: " + student.getUniversity());
        System.out.println("Courses: " + student.getCourses());

        // Check if the decorator is of the correct type before casting
        if (student instanceof DomesticStudentDecorator) {
            System.out.println("County of Residence: " + ((DomesticStudentDecorator) student).getCountyOfResidence());
        }

        if (student instanceof GraduateDecorator) {
            System.out.println("Program: " + ((GraduateDecorator) student).getProgram());
        }

        if (student instanceof InternationalStudentDecorator) {
            System.out.println("Visa: " + ((InternationalStudentDecorator) student).getVisa());
        }

        // Test setting level, grade, and course list
        student.setLevel(UndergraduateDecorator.Level.LEVEL2);
        System.out.println("Student Level of Undergrad student" + student.getLevel());
        student.setGrade("CS", "101", "01", "B");
        List<String> courseList = student.getCourseList();
        courseList.add("Additional Course");
        student.getCourseList();

        System.out.println("Level: " + student.getLevel());
        System.out.println("Updated Courses: " + student.getCourses());
        System.out.println("Updated Courses: " + student.getCourseList());
    }
}
