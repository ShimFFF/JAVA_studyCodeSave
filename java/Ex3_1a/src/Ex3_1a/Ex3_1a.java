//금액에 따른 수수료 측정

package Ex3_1a;

import java.util.Scanner;


public class Ex3_1a {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int key=1;
		while(true) {
			System.out.print("If you want start program,"
					+ "Enter the 1 : ");
			key=sc.nextInt(); 
			if (key!=1) break; //프로그램 종료
			
			System.out.print("Enter the check amount : ");
			int check=sc.nextInt(); //체크할꺼 입력 ㄱ
			
			if(check<10) System.out.println("charge : "+(1));
			else if(check<100) System.out.println("charge : "+(check*0.1));
			else if(check<1000) System.out.println("charge : "+(5+(check*0.05)));
			else System.out.println("charge : "+(40+(check*0.01)));
			

			System.out.println("\n\n");
		}
		
	}

}
