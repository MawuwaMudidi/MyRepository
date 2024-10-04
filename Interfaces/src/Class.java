import java.util.ArrayList;
import java.util.List;

public interface Class {
    void takeAttendance(Person person);
    List<String> getAttendanceList();
}

class Math implements Class {
    List<String> attendanceList;

    public Math() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(String name) {
        attendanceList.add(name);
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(String name) {
        attendanceList.add(name);
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class ClassRunner {
    public static void main(String[] args) {
        Class mathClass = new Math();
        Class italianClass = new Italian();

        Person wafi = new Student("Wafi", 25, "Math");
        mathClass.takeAttendance(wafi);

        Person jermie = new Student("jermie", 27, "Math");
        mathClass.takeAttendance(jermie);

        Person melisa = new Student("melisa", 20, "Italian");
        italianClass.takeAttendance(melisa);

        Person gulead = new Student("gulead", 21, "Italian");
        italianClass.takeAttendance(gulead);

        System.out.println(mathClass.getAttendanceList());
        System.out.println(italianClass.getAttendanceList());
    }
}