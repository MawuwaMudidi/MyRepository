class ProgrammingCourse extends OnlineCourse {

    public ProgrammingCourse(double courseFee, String courseStartTime, String courseEndTime) {
        super(courseFee, courseStartTime, courseEndTime);
    }

    @Override
    public void printCourseDescription() {
        System.out.println("The programming course is versatile and inclusive.");
    }
}
