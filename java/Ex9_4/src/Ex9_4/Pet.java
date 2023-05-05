package Ex9_4;

public class Pet {
	private String name;
	 private int age; //in years
	 private double weight;//in pounds
	 public Pet()
	 {
		 name = "No name yet.";
		 age = 0;
	 	weight = 0;
	 }
	 public Pet(String initialName, int initialAge,double initialWeight)
	 {
		 name = initialName;
		 if ((initialAge < 0) || (initialWeight < 0))
		 {
			 System.out.println("Error: Negative age or weight.");
			 System.exit(0);
		 }
		 else
		 {
			 age = initialAge;
			 weight = initialWeight;
		 }
	 }
	 
	 public void setPet(String newName, int newAge,double newWeight)
	 {
		 name = newName;
		 if ((newAge < 0) || (newWeight < 0))
		 {
			 System.out.println("Error: Negative age or weight.");
			 System.exit(0);
		 }
		 else
		 {
			 age = newAge;
			 weight = newWeight;
		 }
	 }
	 public Pet(String initialName)
	 {
		 name = initialName;
		 age = 0;
		 weight = 0;
	 }
	 public void setName(String newName)
	 {
		 name = newName; //age and weight are unchanged.
	 }
	 public Pet(int initialAge)
	 {
		 name = "No name yet.";
		 weight = 0;
		 if (initialAge < 0)
		 {
			 System.out.println("Error: Negative age.");
			 System.exit(0);
		 }
		 else
			 age = initialAge;
	 }
	 public void setAge(int newAge)
	 {
		 if (newAge < 0)
		 {
			 System.out.println("Error: Negative age.");
			 System.exit(0);
		 }
		 else
			 age = newAge;
		 //name and weight are unchanged.
	 }
	 public Pet(double initialWeight)
	 {
		 name = "No name yet";
		 age = 0;
		 if (initialWeight < 0)
		 {
			 System.out.println("Error: Negative weight.");
			 System.exit(0);
		 }
	 }
	 public int getAge() {
		 return this.age;
	 }
	 public String getName() {
		 return this.name;
	 }
	 public double getWeight() {
		 return weight;
	 }
	 
	 
	 
}
