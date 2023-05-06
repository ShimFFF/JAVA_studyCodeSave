package Ex7_1a;

import java.util.Scanner;

public class Ex7_1a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Score : ");
		int n=sc.nextInt();
		
		int sum=0;
		
		int []score=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Score number "+(i+1)+": ");
			score[i]=sc.nextInt();
			sum+=score[i];
		}
		
		int avg=sum/n;
		System.out.println("average : "+avg);
		System.out.print("Above averaeg : ");
		
		for(int i=0;i<n;i++) {
			if(score[i]>avg)
				System.out.print(score[i]+" ");
		}
	}
	
}
