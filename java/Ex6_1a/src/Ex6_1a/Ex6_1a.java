package Ex6_1a;

import java.util.Scanner;

class Time{
	
	//0~23
	private int hour;
	//0~59
	private int minute;
	
	public Time(){
		hour=0;
		minute=0;
	} 
	public static boolean isValid(int h,int m) {
		//유효한 범위에 있는지
		if(h>=0&&h<60) {
			if(m>=0&&m<60) {
				return true;
			}
		}
		return false;
		
	}
	public void setTime(int h, int m) {
		if(Time.isValid(h, m)) {
			this.hour=h;
			this.minute=m;
			return;
		}
		else {
			System.out.println("retry");
			return;
		}
	}
	public void setTime2(int h, int m, boolean isPM) {
		if(isPM) {	
			setTime(h+12%24,m);
			return;
			
		}
		System.out.println("retry");
		return;
	}
	public void print() {
		System.out.println("hour : "+hour+"\nminute : "+minute);
	}
	
	
}

public class Ex6_1a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Time time=new Time();
		
		System.out.print("Enter the hour : ");
		int h=sc.nextInt();
		System.out.print("Enter the minute : ");
		int m=sc.nextInt();
		
		
		
		boolean pm;
		System.out.print("If PM enter the 1 : ");
		int a=sc.nextInt();
		if(a==1) {
			pm=true;
			time.setTime2(h,m,pm);
			time.print();
		}
		else {
			time.setTime(h, m);
			time.print();
		}
		
		
	}
}
