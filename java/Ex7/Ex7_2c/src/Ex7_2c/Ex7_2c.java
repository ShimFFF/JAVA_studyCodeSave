package Ex7_2c;

import java.util.Scanner;

class Polynomial{
	private int n; //지수
	private double[] cfnt; //계수
	
	public Polynomial(int n){
		this.n=n;
		this.cfnt=new double[n+1];
		for(int i=0;i<n+1;i++)
			cfnt[i]=0;
	}
	public void setConstant(int i, double val) {
		this.cfnt[i]=val;
	}
	public double evaluate(double x) {
		double sum=0;
		
		for(int i=0;i<n+1;i++) 
			sum+=Math.pow(x, i)*cfnt[i];
		return sum;
	}
	
}

public class Ex7_2c {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter degree : ");
		int n=sc.nextInt();
		
		Polynomial ploy=new Polynomial(n);
		
		int check=1;
		double c=0;
		
		while(true) {
			System.out.println("enter 0, set coefficents end");
			check=sc.nextInt();
			if(check==0) break;
			
			System.out.print("degree : ");
			n=sc.nextInt();
			System.out.print("value : ");
			c=sc.nextDouble();
			
			ploy.setConstant(n, c);
		}
		System.out.print("Enter the value of X : ");
		double x=sc.nextDouble(); 
		
		System.out.print("\nresult : "+ploy.evaluate(x));
	}

}
