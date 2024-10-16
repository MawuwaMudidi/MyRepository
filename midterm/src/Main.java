//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OnlineCourse programmingCourse = new OnlineCourse(200, "IT", 2.3,
                8, 9) {
            @Override
            public void printCourseDescription() {
                
            }

            @Override
            public void printEnrolledStudents() {

            }

            @Override
            public void unenrollStudent(Student student) {

            }
        };
        OnCampusCourse mathematicsCourse = new OnCampusCourse(100, "Algebra", 3.5, 3, 5) {
            @Override
            public void printCourseDescription() {

            }

            @Override
            public void printEnrolledStudents() {

            }
        }
    }
}