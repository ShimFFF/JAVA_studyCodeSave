package Ex9_6;

public class Employee extends Person {
    private int employeeID;
    private String department;

    public Employee(String name, int employeeID, String department) {
        super(name);
        this.employeeID = employeeID;
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

