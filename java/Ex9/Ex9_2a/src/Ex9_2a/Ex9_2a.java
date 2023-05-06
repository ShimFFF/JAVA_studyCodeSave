package Ex9_2a;

public class Ex9_2a {
	public static void main(String[] args)
	 {
		Person[] people = new Person[4];
		people[0] = new Undergradute("Cotty, Manny", 4910, 1);
		people[1] = new Undergradute("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergradute("Bugg, June", 9901, 4);
	 	for (Person p : people)
	 	{
		p.writeOutput();
		System.out.println();
	 	}
	}

}
