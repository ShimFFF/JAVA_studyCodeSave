package Ex4_2a;

import java.util.Scanner;


class MotorBoat {
	private float f=0, M=0, s=0, e=0;
	
	public static final float C=60;
	
	public void getter(float f, float M, float s, float e){
		this.f=f;
		if(f>C) {
			System.out.println("ERROR : fuel amount more then tank capacity");
			return;
		}
		this.M=M;
		this.s=s;
		this.e=e;
		
		
	}
	
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

public class Ex4_2a {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		while(true) {
			System.out.print("If you want start program enter the 1 : ");
			i=sc.nextInt();
			
			if(i!=1) break;
			
			MotorBoat mb=new MotorBoat();
			
			System.out.print("Enter the Amount of fuel : ");
			float f=sc.nextFloat();
			
			System.out.print("Enter the Max speed : ");
			float M=sc.nextFloat();
			
			System.out.print("Enter the current speed : ");
			float s=sc.nextFloat();
			
			System.out.print("Enter the efficiency of boat's motor : ");
			float e=sc.nextFloat();
			
			mb.getter(f, M, i, e);
			
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
