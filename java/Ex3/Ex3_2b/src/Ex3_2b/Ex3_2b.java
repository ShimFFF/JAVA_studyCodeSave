package Ex3_2b;

import java.util.Scanner;

public class Ex3_2b {
	public static void main(String[] args) {
		int a;
		int key=1;
		
		int max=-1, min=-1;
		double sum=0;
		int index=0;
		
		int A=0,b=0,c=0,d=0,f=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("If you want start program"
					+ " Enter the 1 : ");
			key=sc.nextInt(); 
			if (key!=1) break; //프로그램 종료
			
			System.out.println("\nEnter the number list.\n"
					+ "when input is complete, press the negative integer");
			
			while(true) {
				a=sc.nextInt();
				if(a<0) break; //음수 받으면 입력 받기 종료
				
				if(a>100) {
					System.out.println("error : grade must less than 100");
					continue;}
				
				
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
				
				//abcd 분류
				if(a>=90) A++;
				else if(a>=80) b++;
				else if(a>=70) c++;
				else if(a>=60) d++;
				else f++;
				
				
				
			}
			System.out.println("max : "+max+"\n"
			+"min : "+min+"\naverage : "+sum/index );
			System.out.println("a : "+A+"  b: "+b
					+"  c: "+c+"  d: "+d+"  f : "+f);
		}
			
		
		}
}
