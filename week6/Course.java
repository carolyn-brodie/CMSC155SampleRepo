package week6;

public class Course {

    private String department;
    private int courseNumber;
    private int credits;

    public Course(String dept, int courseNumber, int credits) {
        this.department = dept;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public String toString() {
        return this.department + courseNumber + " is " + credits + " credits.";
    }
}
