package Ex7_1b;

import java.util.Scanner;

public class Ex7_1b {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int []frq=new int [10];
		for(int i=0;i<10;i++)
			frq[i]=0;
		
		System.out.print("Enter phone number(with out '-') : ");
		String phnum= sc.next();
		int a=0;
		for(int i=0;i<8;i++) {
			a=(int)phnum.charAt(i)-'0'; //숫자 변환
			frq[a]++;
		}
		for(int i=0;i<10;i++)
			System.out.println((i)+":"+frq[i]);
		
		
	}

}
