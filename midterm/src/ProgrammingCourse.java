import java.time.LocalTime;

class ProgrammingCourse extends OnlineCourse {
    public ProgrammingCourse(int courseFee, String courseType, double courseTiming, LocalTime courseStartTime, LocalTime courseEndTime) {
        super(courseFee, courseType, courseTiming, courseStartTime, courseEndTime);
    }

    @Override
    public void printCourseDescription() {

    }

    @Override
    public void printEnrolledStudents() {

    }

    @Override
    public void enrollStudent(Student student) {
        super.enrollStudent(student);
        System.out.println(student + "has successfully enrolled in programming course.");
    }

    @Override
    public void unenrollStudent(Student student) {

    }
}
