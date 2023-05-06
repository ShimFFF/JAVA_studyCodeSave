package Ex6_4;

import java.util.Scanner;

class Characteristic {
    private String description;
    private int rating;

    // Constructor
    public Characteristic(String description) {
        this.description = description;
        this.rating = 0;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }

    // Public method to calculate compatibility
    public double getCompatibility(Characteristic otherRating) {
        if (isMatch(otherRating)) {
            return getCompatibilityMeasure(otherRating);
        } else {
            return 0;
        }
    }

    // Private method to calculate compatibility measure
    private double getCompatibilityMeasure(Characteristic otherRating) {
        if (rating != 0 && otherRating.getRating() != 0) {
            double r1 = rating;
            double r2 = otherRating.getRating();
            double m = 1 - Math.pow(r1 - r2, 2) / 81;
            return m;
        } else {
            return 0;
        }
    }

    // Private method to check if descriptions match
    private boolean isMatch(Characteristic otherRating) {
        return description.equalsIgnoreCase(otherRating.getDescription());
    }

    // Setter to set rating
    public void setRating(int rating) {
        this.rating = rating;
    }
}


public class Ex6_4 {
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the description1 : ");
		Characteristic c1=new Characteristic(sc.next());
		System.out.print("Enter the rating : ");
		c1.setRating(sc.nextInt());
		
		
		System.out.print("\nEnter the description2 : ");
		Characteristic c2=new Characteristic(sc.next());
		System.out.print("Enter the rating : ");
		c2.setRating(sc.nextInt());
		
		System.out.println("Compatibility : "
				+c1.getCompatibility(c2));
	}
}
