package Ex2_3b;

import java.util.Scanner;


public class Ex2_3b {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the radius in onches : ");
		float r=sc.nextFloat(); //반지름 (인치)
		
		System.out.print("enter the depth in feet : ");
		float h=sc.nextFloat(); //깊이 (피트)
		
		r=r/12;

		System.out.println("volum : "+(((3.141592)*r*r*h)*7.48));
	}
}
