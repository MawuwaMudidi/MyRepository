import java.util.HashSet;

abstract class OnCampusCourse implements Course{
    private double courseFee;
    private String courseStartTime;
    private String courseEndTime;
    private HashSet<Student> enrolledStudents = new HashSet<>();

    public OnCampusCourse(double courseFee, String courseStartTime, String courseEndTime){
        this.courseFee = courseFee;
        this.courseStartTime = courseStartTime;
        this.courseEndTime = courseEndTime;
        this.enrolledStudents = new HashSet<>();
    }

    @Override
    public double getCourseFee() {
        return courseFee;
    }

    @Override
    public String getCourseStartTime() {
        return courseStartTime;
    }

    @Override
    public String getCourseEndTime() {
        return courseEndTime;
    }

    @Override
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    @Override
    public void unenrollStudent(Student student) {
        enrolledStudents.remove(student);
    }

    @Override
    public void printEnrolledStudents() {
        System.out.println("---The enrolled Students oncampus---");
        for(Student student : enrolledStudents){
            System.out.println(student);
        }
    }
}
