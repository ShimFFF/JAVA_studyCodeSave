package Ex9_6;

public class Student extends Person {
    private String major;
    private int studentNumber;

    public Student(String name, String major, int studentNumber) {
        super(name);
        this.major = major;
        this.studentNumber = studentNumber;
    }

    public String getMajor() {
        return major;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Major: " + major);
        System.out.println("Student number: " + studentNumber);
    }
}
