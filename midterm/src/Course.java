import java.time.LocalTime;

public interface Course {
    double getCourseFee();
    LocalTime getCourseStartTime();
    LocalTime getCourseEndTime();
    void printCourseDescription();
    void printEnrolledStudents();
    void enrollStudent(Student student);
    void unenrollStudent(Student student);
}
