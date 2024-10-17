//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Maua", 23, "M-001-P");
        Student student2 = new Student("Dawoood", 26, "D-001-P");
        Student student3 = new Student("Shazli", 30, "S-001-P");
        Student student4 = new Student("Jeremie", 25, "J-001-P");
        Student student5 = new Student("Hana", 27, "H-001-P");
        Student student6 = new Student("Melissa", 20, "M-001-M");
        Student student7 = new Student("Prince", 24, "P-001-M");
        Student student8 = new Student("Yosief", 32, "Y-001-M");
        Student student9 = new Student("Jonathan", 29, "J-001-M");
        Student student10 = new Student("Dawa", 30, "D-001-M");

        ProgrammingCourse programmingCourse = new ProgrammingCourse(199.99, "8:00am", "10:00am");
        MathematicsCourse mathematicsCourse = new MathematicsCourse(99.9,"11:00am", "1:00pm");

        programmingCourse.enrollStudent(student1);
        programmingCourse.enrollStudent(student2);
        programmingCourse.enrollStudent(student3);
        programmingCourse.enrollStudent(student4);
        programmingCourse.enrollStudent(student5);
        programmingCourse.printEnrolledStudents();

        mathematicsCourse.enrollStudent(student6);
        mathematicsCourse.enrollStudent(student7);
        mathematicsCourse.enrollStudent(student8);
        mathematicsCourse.enrollStudent(student9);
        mathematicsCourse.enrollStudent(student10);
        mathematicsCourse.printEnrolledStudents();

        programmingCourse.printCourseDescription();
        System.out.println("Programming course fee: " + programmingCourse.getCourseFee());
        System.out.println("Programming course starts at " + programmingCourse.getCourseStartTime());
        System.out.println("Programming course ends at " + programmingCourse.getCourseEndTime());

        programmingCourse.printCourseDescription();
        System.out.println("Mathematics course fees: " + mathematicsCourse.getCourseFee());
        System.out.println("Mathematics course starts at " + mathematicsCourse.getCourseStartTime());
        System.out.println("Mathematics course ends at " + mathematicsCourse.getCourseEndTime());

        programmingCourse.unenrollStudent(student2);
        System.out.println("Student " + student2.getName() + " left the course");

    }
}