package Ex4_4;

import java.util.Scanner;

class Purchase{
	private String name;
	private int Count;
	private double groupPrice;
	private int buyNumber;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPrice(int count, double countCost) {
		//defensive
		if((count<=0)||(countCost<=0)) 
			System.out.println("ERROR");
		
		else { //alloc
			this.Count=count;
			this.groupPrice=countCost;
		}
	}
	
	public void set_buyNumber(int num) {
		if(num<0) {
			System.out.println("ERROR");
		}
		else this.buyNumber=num;
	}
	
	public void writeOutput() {
		System.out.println(buyNumber+":"+name);
		System.out.println("at "+Count+"for $"+groupPrice);
		
	}
	public String getName() {
		return name;
	}
	public double getTotalCost() {
		return (double)(groupPrice/Count*buyNumber);
	}
	public double getUnitCost() {
		return (groupPrice/Count);
	}
	public int getNumberBought() {
		return buyNumber;
	}
	public void setVal() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the name : ");
		this.setName(sc.next());
		
		System.out.print("Enter the group count : ");
		int a=sc.nextInt();
		System.out.print("Enter the group price : ");
		this.setPrice(a, sc.nextDouble());
		
		System.out.print("Enter the buy number : ");
		this.set_buyNumber(sc.nextInt());
	}
}


public class Ex4_4 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total=0;
		int s=1;
		while(true) {
			System.out.print("Enter 1 program start : ");
			s=sc.nextInt();
			if(s!=1)break;
			for(int i=0;i<5;i++) {
				Purchase list=new Purchase();
				list.setVal();
				total+=list.getTotalCost();
			}
			System.out.println("total : "+total);
		}
		
	}
	
}
