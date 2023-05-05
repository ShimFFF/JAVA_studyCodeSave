package Ex4_3;

import java.util.Scanner;

class Grade{
	int A=0,B=0,C=0,D=0,F=0;
	
	//퍼센트 저장
	int pa=0,pb=0,pc=0,pd=0,pf=0;
	int total=0;
	
	Grade(int a, int b, int c, int d, int f){
		this.A=a;
		this.B=b;
		this.C=c;
		this.D=d;
		this.F=f;
	}
	
	public void setA(int a) {this.A=a;}
	public void setB(int b) {this.A=b;}
	public void setC(int c) {this.A=c;}
	public void setD(int d) {this.A=d;}
	public void setF(int f) {this.A=f;}
	
	public int total() {
		this.total=A+B+C+D+F;
		return (A+B+C+D+F);
	}
	
	public void percent() {
		this.pa = (int) (100.0 * A / total);
	    this.pb = (int) (100.0 * B / total);
	    this.pc = (int) (100.0 * C / total);
	    this.pd = (int) (100.0 * D / total);
	    this.pf = (int) (100.0 * F / total);
	}
	
	public void graph() {
		for(int i=0;i<=100;i++) {
			if(i%10==0) System.out.print(i);
			else if(i%8==0)continue;
			else System.out.print(" ");
			
		}
		System.out.print("\n");
		
		for(int i=0;i<=100;i++) {
			System.out.print("*");
		}
		System.out.print("\n");
		
		for(int i=0;i<pa;i++) {
			System.out.print("*");
		}
		System.out.println("A");
		
		for(int i=0;i<pb;i++) {
			System.out.print("*");
		}
		System.out.println("B");
		
		for(int i=0;i<pc;i++) {
			System.out.print("*");
		}
		System.out.println("C");
		
		for(int i=0;i<pd;i++) {
			System.out.print("*");
		}
		System.out.println("D");
		
		for(int i=0;i<pf;i++) {
			System.out.print("*");
		}
		System.out.println("F");
	} 
}

public class Ex4_3 {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter A student numder : ");
			int a=sc.nextInt();
			
			System.out.print("Enter B student numder : ");
			int b=sc.nextInt();
			
			System.out.print("Enter C student numder : ");
			int c=sc.nextInt();
			
			System.out.print("Enter D student numder : ");
			int d=sc.nextInt();
			
			System.out.print("Enter F student numder : ");
			int f=sc.nextInt();
			
			
			Grade g=new Grade(a,b,c,d,f);
			
			System.out.println("\ntotal student : "+g.total());
			
			g.percent();
			
			g.graph();
			
			System.out.println("A:"+g.pa+"  B:"+g.pb+"  c:"
			+g.pc+"  D:"+g.pd+"  F:"+g.pf);
			
			
		}

}
