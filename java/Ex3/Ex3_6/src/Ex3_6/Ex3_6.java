//별 찍기
package Ex3_6;

import java.util.Scanner;

public class Ex3_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of triangle : ");
		int size=sc.nextInt();
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=size-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
