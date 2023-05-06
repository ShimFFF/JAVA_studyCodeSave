package Ex6_2b;

import java.util.Scanner;

class Time{
	
	//0~23
	private int hour;
	//0~59
	private int minute;
	
	private boolean isPM;
	
	public Time(){
		hour=0;
		minute=0;
		isPM=false;
	} 
	//constructor add
	public Time(int h, int m) {
		if(Time.isValid(h, m)) {
			this.hour=h;
			this.minute=m;
			isPM=false;
			return;
		}
		else {
			System.out.println("error");
			return;
		}
	}
	public Time(int h, int m, boolean isPM) {
		this.isPM=isPM;
		if(isPM) {	
			setTime(h+12%24,m);
			return;
			
		}
		System.out.println("retry");
		return;
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
	public void getTime12() {
		if(12<this.hour) {
			//pm인 경우
			int h=this.hour-12;
			//String.format 사용
			System.out.println(String.format("%s", h)
					+":"+String.format("%s", this.minute)
					+" PM");
		}else if(isPM) {
			System.out.println(String.format("%s", this.hour)
					+":"+String.format("%s", this.minute)
					+" PM");
		}else {
			System.out.println(String.format("%s", this.hour)
					+":"+String.format("%s", this.minute)
					+" AM");
		}
	}
	public void getTime24() {
		
		if(isPM) {
			System.out.println(String.format("%s", this.hour+12)
					+String.format("%s", this.minute));
		}else {
			if(10>this.hour) {
				System.out.println(String.format("0"+"%s", this.hour)
						+String.format("%s", this.minute));
			}else {
				System.out.println(String.format("%s", this.hour)
						+String.format("%s", this.minute));
				
			}
	}
	
	
	
}


}
public class Ex6_2b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the hour : ");
		int h=sc.nextInt();
		System.out.print("Enter the minute : ");
		int m=sc.nextInt();
		
		System.out.println("the case of 3 parameter and is pm");
		Time time=new Time(h,m,true);
		time.getTime12();
		time.getTime24();
		
		System.out.println("\nthe case of 2 parameter");
		Time time2=new Time(h,m);
		time2.getTime12();
		time2.getTime24();
		
			
		
		
	}
}
