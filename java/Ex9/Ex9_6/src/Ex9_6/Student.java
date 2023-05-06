package Ex9_6;

public class Student  extends Person{
	private int studentNumber;
	public Student() {
		super(); //상위 클래스 생성자 호출
		studentNumber = 0;
	}
	public Student(String initialName, int newStudentNumber) {
		super(initialName);
		studentNumber= newStudentNumber;
		
	}
	//이름 학번 재설정
	public void reset(String newName, int newStudentNumber)
	 {
		setName(newName);
		studentNumber = newStudentNumber;
	 }
	
	public int getStudentNumber()
	 {
		return studentNumber;
	 }
	public void setStudentNumber(int newStudentNumber)
	 {
		studentNumber = newStudentNumber;
	 }
	
	public void writeOutput()
	 {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber);
	 }
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent)&&
				(this.studentNumber==otherStudent.studentNumber);
	}
}
