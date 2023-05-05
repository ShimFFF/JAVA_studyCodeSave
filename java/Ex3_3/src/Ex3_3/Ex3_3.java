//10년 뒤 예금한 금액 출력
package Ex3_3;

import java.util.Scanner;

public class Ex3_3 {
	
	public static void main(String srgs[]) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the account balance : ");
		float acb = sc.nextFloat();
		
		System.out.println("Enter the interest rate : ");
		float intrt = sc.nextFloat();
		intrt=intrt/100;
		
		float annally=acb, monthly=acb, day=acb;
		
		//10년
		for(int i=0;i<10;i++) {
			for(int j=0;j<365;j++) {
				day+=(day*intrt/365);
			}
			for(int j=0;j<12;j++) {
				monthly+=(monthly*intrt/12);
			}
			annally+=annally*intrt;
		}
		System.out.println("After 10 years, account balance");
		System.out.println("daily : "+day);
		System.out.println("monthly : "+monthly);
		System.out.println("annally : "+annally);
		
	}
}
