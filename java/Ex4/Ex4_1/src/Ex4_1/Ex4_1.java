package Ex4_1;

import java.util.Scanner;

class MotorBoat {
	public float C=0, f=0, M=0, s=0, e=0;
	
	public void Mcspeed(float t) {
		System.out.println("fuel used at the Max : "+e*M*M*t);
		System.out.println("fuel used at the Min : "+e*s*s*t);
		
	}
	public void tDis(float t) {
		System.out.println("Travel distande : "+s*t);
	}
	public void sf_tdis() {
		System.out.println("Travel distance : "+Math.sqrt(f / e) * s);
		
	}
}


public class Ex4_1 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		while(true) {
			System.out.print("If you want start program enter the 1 : ");
			i=sc.nextInt();
			
			if(i!=1) break;
			
			MotorBoat mb=new MotorBoat();
			
			System.out.print("Enter the capacity of fuel tank : ");
			mb.C=sc.nextFloat();
			
			System.out.print("Enter the Amount of fuel : ");
			mb.f=sc.nextFloat();
			
			System.out.print("Enter the Max speed : ");
			mb.M=sc.nextFloat();
			
			System.out.print("Enter the current speed : ");
			mb.s=sc.nextFloat();
			
			System.out.print("Enter the efficiency of boat's motor : ");
			mb.e=sc.nextFloat();
			
			System.out.print("Enter the time : ");
			float t=sc.nextFloat();
			mb.Mcspeed(t);
			System.out.print("\n");
			
			System.out.print("Enter the time : ");
			float t2=sc.nextFloat();
			mb.tDis(t2);
			System.out.print("\n");
		
			mb.sf_tdis();
			System.out.print("\n");
		}
	}
}
