package Ex10_7;

import java.util.Arrays;

class Student extends Person implements Comparable<Student> {
    private int studentNumber;

    public Student() {
        super();
        studentNumber = 0;
    }

    public Student(String initialName, int newStudentNumber) {
        super(initialName);
        studentNumber = newStudentNumber;
    }

    public void reset(String newName, int newStudentNumber) {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(Student otherStudent) {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }

    @Override
    public int compareTo(Student other) {
        return this.studentNumber - other.studentNumber;
    }

    
    
    
}


public class Ex10_7 {
	public static void main(String[] args) {
	    Student[] students = {
	            new Student("Shim", 123),
	            new Student("Sea", 456),
	            new Student("won", 789),
	            new Student("Kim", 234),
	            new Student("lee", 567)
	    };

	    // Sort students by studentNumber
	    Arrays.sort(students);

	    // Output students by ascending student number
	    for (Student student : students) {
	        student.writeOutput();
	        System.out.println();
	    }
	}


}
