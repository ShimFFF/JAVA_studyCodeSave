package Ex2_1b;

import java.util.Scanner;

public class Ex2_1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit : ");
		int Fh = sc.nextInt();
		
		System.out.println("Celsius : "+(5*(Fh-32)/9));
	}

}
