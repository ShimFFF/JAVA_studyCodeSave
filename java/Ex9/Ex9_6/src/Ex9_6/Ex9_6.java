package Ex9_6;

class Faculty extends Employee {
    private String title;

    public Faculty(String name, int employeeID, String department, String title) {
        super(name, employeeID, department);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Title: " + title);
    }
}

class Staff extends Employee {
    private int payGrade;

    public Staff(String name, int employeeID, String department, int payGrade) {
        super(name, employeeID, department);
        this.payGrade = payGrade;
    }

    public int getPayGrade() {
        return payGrade;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Pay grade: " + payGrade);
    }
}


public class Ex9_6 {
	 public static void main(String[] args) {
	        Person[] people = new Person[4];
	        people[0] = new Undergradute("won", 202235876, 1);
	        people[1] = new Student("shim",  202235069);
	        people[2] = new Faculty("kim",  202035069, "Computer Science", "Professor of Computer Science");
	        people[3] = new Staff("Sea", 5678, "Human Resources", 10);

	        for (int i = 0; i < people.length; i++) {
	            people[i].writeOutput();
	            System.out.println();
	        }
	    }

}
