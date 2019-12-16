package academy.everyonecodes.java.week2.set1.exercise1;

public class Student {
    private String studentName;
    private String peerName;

    public Student(String studentName, String peerName) {
        this.studentName = studentName;
        this.peerName = peerName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getPeerName() {
        return peerName;
    }

    public void setPeerProgramer(String peerName) {
        this.peerName = peerName;
    }

}
