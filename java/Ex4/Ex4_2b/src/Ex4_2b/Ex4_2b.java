package Ex4_2b;

import java.util.Scanner;

class Counter{
	
	private int cnt=0;
	
	public void reset(){
		this.cnt=0;
	}
	public void increase() {
		this.cnt++;
	}
	public void decrease() {
		if(cnt==0) {
			System.out.println("count==0");
			return;
		}
		this.cnt--;
	}
	public int current() {
		return this.cnt;
	}
	
}
class Print{
	public void prtln(String str) {
		System.out.println(str);
	}
	public void prt(String str) {
		System.out.print(str);
	}
}

public class Ex4_2b {
	
	public static void main(String[] args) {
		
		Print prt=new Print();
		Counter cnt=new Counter();
		Scanner sc= new Scanner(System.in);
		
		int i=1;
		
		while(true) {
			prt.prt("If you start program enter the 1 : ");
			i=sc.nextInt();
			if(i!=1) break;
			
			prt.prtln("count reset enter the 0");
			prt.prtln("count increasing enter 1 ");
			prt.prtln("count decreasing enter -1");
			prt.prtln("current count value print enter 5");
			prt.prtln("End work enter 333");
			int a=0;
			while(true) {
				a=sc.nextInt();
				if(a==1) cnt.increase();
				else if(a==-1) cnt.decrease();
				else if(a==0) cnt.reset();
				else if(a==5) System.out.println(cnt.current());
				else if(a==333)break;
				else prt.prtln("ERROR");
			}
			
			System.out.println(cnt.current());
			
		}
	}

}
