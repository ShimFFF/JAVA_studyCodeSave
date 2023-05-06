//최대 최소 평균 출력

package Ex3_2a;

import java.util.Scanner;

public class Ex3_2a {
	public static void main(String[] args) {
		int a;
		int key=1;
		
		int max=-1, min=-1;
		double sum=0;
		int index=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("If you want start program,"
					+ " Enter the 1 : ");
			key=sc.nextInt(); 
			if (key!=1) break; //프로그램 종료
			
			System.out.println("\nEnter the number list.\n"
					+ "when input is complete, press the negative integer");
			
			while(true) {
				a=sc.nextInt();
				if(a<0) break;
				if(index==0) { //처음 값 읽었을 때
					max=a; 
					min=a; 
					sum=a;
					index++;
					continue;
				}
				if(a>max) max=a;
				if(a<min) min=a;
				sum+=a;
				index++;
				
				
			}
			System.out.println("max : "+max+"\n"
			+"min : "+min+"\naverage : "+sum/index );
			
		}
 	}
}
