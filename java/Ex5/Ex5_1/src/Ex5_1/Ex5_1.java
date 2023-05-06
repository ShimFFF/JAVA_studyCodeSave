package Ex5_1;

import java.util.Scanner;


class MotorBoat {
	private float f=0, M=0, s=0, e=0;
	
	public static final float C=60;
	
	public void setting(float f, float M, float s, float e){
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
	public boolean equal(MotorBoat boat2) {
		if(this.f!=boat2.f) return false;
		if(this.M!=boat2.M) return false;
		if(this.s!=boat2.s) return false;
		if(this.e!=boat2.e) return false;
		
		return true;
	} 
}


public class Ex5_1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=1;
		
		MotorBoat b1 = new MotorBoat();
	
		MotorBoat b2 = new MotorBoat();
		
		while(true) {
			if(i==3) {
				if(b1.equal(b2)) 
					System.out.println("boat1,boat2 are equal");
				else 
					System.out.println("boat1, boat2 are different");
				
				System.out.println("\n\nrestart enter 1");
				int a=sc.nextInt();
				if(a==1) i=1;
				else break;
			}
			
			System.out.print("[Boat"+i+"]\n");
			
			System.out.print("Enter fules : ");
			float f = sc.nextFloat();
			
			System.out.print("Enter maximum speed :");
			float M = sc.nextFloat();
			
			System.out.print("Enter current speed : ");
			float s = sc.nextFloat();

			System.out.print("Efficiency of the boat's motor : ");
			float e = sc.nextFloat();
			
			if(i==1) {
				b1.setting(f,M,s,e);
				i++;
				}
			else if(i==2) {
				b2.setting(f,M,s,e);
				i++;
			}
		
			
		}

	
	
	
	}

}
