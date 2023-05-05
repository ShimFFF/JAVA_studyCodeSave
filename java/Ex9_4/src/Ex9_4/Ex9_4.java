package Ex9_4;

import java.util.Scanner;

class Dog extends Pet {
    private String breed;
    private boolean boosterShot;
    
    public Dog() {
        super();
        breed = "No breed yet";
        boosterShot = false;
    }
    
    public Dog(String initialName, int initialAge, double initialWeight, String initialBreed, boolean initialBoosterShot) {
        super(initialName, initialAge, initialWeight);
        breed = initialBreed;
        boosterShot = initialBoosterShot;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    
    public boolean hasBoosterShot() {
        return boosterShot;
    }
    
    public void setBoosterShot(boolean newBoosterShot) {
        boosterShot = newBoosterShot;
    }
}

public class Ex9_4 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dog[] dogs = new Dog[5];

        for (int i = 0; i < dogs.length; i++) {
            System.out.print("Enter dog name: ");
            String name = input.nextLine();

            System.out.print("Enter dog age: ");
            int age = Integer.parseInt(input.nextLine());

            System.out.print("Enter dog weight: ");
            double weight = Double.parseDouble(input.nextLine());

            System.out.print("Enter dog breed: ");
            String breed = input.nextLine();

            System.out.print("Does the dog have booster shot (true/false): ");
            boolean boosterShot = Boolean.parseBoolean(input.nextLine());

            dogs[i] = new Dog(name, age, weight, breed, boosterShot);
        }

        System.out.println("\nDogs over two years old without booster shot:");
        for (Dog dog : dogs) {
            if (dog.getAge() > 2 && !dog.hasBoosterShot()) {
                System.out.println(dog.getName() + " (" + dog.getBreed() + ")");
            }
        }
    }
}
