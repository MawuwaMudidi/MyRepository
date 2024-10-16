import java.time.LocalTime;

public class MathematicsCourse extends OnCampusCourse{
    public MathematicsCourse(int courseFee, String courseType, double courseTiming, LocalTime courseStartTime, LocalTime courseEndTime) {
        super(courseFee, courseType, courseTiming, courseStartTime, courseEndTime);
    }

    @Override
    public void printCourseDescription() {

    }

    @Override
    public void printEnrolledStudents() {

    }
}
