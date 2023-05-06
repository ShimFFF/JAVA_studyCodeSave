package Ex6_6;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods to set and get name as one string
    public void setName(String name) {
        String[] fullName = name.split(" ");
        this.firstName = fullName[0];
        this.lastName = fullName[1];
    }
    
    public void setName(String fname, String sname) {
        
        this.firstName = fname;
        this.lastName = sname;
    }
    

    public String getName() {
        return firstName + " " + lastName;
    }

    // Static methods to create special instances
    public static Person createToddler() {
        return new Person("A", "toddler", 2);
    }

    public static Person createPreschooler() {
        return new Person("A", "preschooler", 5);
    }

    public static Person createAdolescent() {
        return new Person("An", "adolescent", 9);
    }

    public static Person createTeenager() {
        return new Person("A", "teenager", 13);
    }
}


public class Ex6_6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name(split ' ' for first,second name) : ");
        String name = sc.nextLine(); // nextLine()으로 한 줄의 문자열 입력 받음
        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        Person p1 = new Person("", "", 0);
        p1.setName(name);
        p1.setAge(age);

        System.out.println(p1.getName() + "'s age is " + p1.getAge());

        System.out.print("\n\nEnter the first name : ");
        String fname = sc.next();
        System.out.print("Enter the second name : ");
        String sname = sc.next();
        System.out.print("Enter the age : ");
        int age2 = sc.nextInt();

        Person p2 = new Person("", "", 0);
        p2.setName(fname, sname);
        p2.setAge(age2);
        System.out.println(p2.getName() + "'s age is " + p2.getAge());
		
		System.out.println("\n\ncreate Toddler, Preschooler, Adolescent, Teenager");
		Person tod=Person.createToddler();
		Person pre=Person.createPreschooler();
		Person ado=Person.createAdolescent();
		Person teen=Person.createTeenager();
		
		System.out.println(tod.getName()+"'s age is "
				+String.format("%s",tod.getAge()));
		
		System.out.println(pre.getName()+"'s age is "
				+String.format("%s",pre.getAge()));
		
		System.out.println(ado.getName()+"'s age is "
				+String.format("%s",ado.getAge()));
		
		System.out.println(teen.getName()+"'s age is "
				+String.format("%s",teen.getAge()));
		
		
		
	}
	
}
