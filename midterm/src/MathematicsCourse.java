public class MathematicsCourse extends OnCampusCourse{

    public MathematicsCourse(double courseFee, String courseStartTime, String courseEndTime) {
        super(courseFee, courseStartTime, courseEndTime);
    }

    @Override
    public void printCourseDescription() {
        System.out.println("The mathematics course is well designed " +
                "to teach practical implementations of calculations and algebra");
    }
}
