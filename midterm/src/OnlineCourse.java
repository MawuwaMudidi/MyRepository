import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

abstract class OnlineCourse implements Course{
    private int courseFee;
    private String courseType;
    private double courseTiming;
    private LocalTime courseStartTime;
    private LocalTime courseEndTime;
    private List<String> enrolledStudents;
    private List<String> unenrolledStudents;

    public OnlineCourse(int courseFee, String courseType, double courseTiming,
                          LocalTime courseStartTime, LocalTime courseEndTime){
        this.courseFee = courseFee;
        this.courseType = courseType;
        this.courseTiming = courseTiming;
        this.courseStartTime = courseStartTime;
        this.courseEndTime = courseEndTime;
        this.enrolledStudents = new ArrayList<>();
        this.unenrolledStudents = new ArrayList<>();
    }

    @Override
    public double getCourseFee() {
        return courseFee;
    }

    @Override
    public LocalTime getCourseStartTime() {
        return courseStartTime;
    }

    @Override
    public LocalTime getCourseEndTime() {
        return courseEndTime;
    }

    @Override
    public void enrollStudent(Student student) {
        enrolledStudents.add(student.getName());
        System.out.println(student.getName() + "has been enrolled");
    }

}
