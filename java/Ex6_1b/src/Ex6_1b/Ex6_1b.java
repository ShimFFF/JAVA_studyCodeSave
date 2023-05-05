package Ex6_1b;

import java.util.Scanner;

class RoomOcpy{
	static int sum=0;
	private int roomNum=0;
	private int people=0;
	
	RoomOcpy(int r, int p){
		this.roomNum=r;
		this.people=p;
		sum+=p;
	}
	public void addOneToRoom() {
		this.people++;
		sum++;
	}
	public void removeOneFromRoom() {
		if(this.people==0)return;
		this.people--;
		sum--;
	}
	public int getNumder(){
		return this.roomNum;
	}
	public int getTotal() {
		return RoomOcpy.sum;
	}
	
	
}


public class Ex6_1b {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("room1 numder : ");
		int r1=sc.nextInt();
		System.out.print("people in room1 : ");
		int p1=sc.nextInt();
		RoomOcpy room1=new RoomOcpy(r1, p1);
		
		System.out.print("\nroom2 numder : ");
		int r2=sc.nextInt();
		System.out.print("people in room2 : ");
		int p2=sc.nextInt();
		RoomOcpy room2=new RoomOcpy(r2, p2);
		
		System.out.println("room1 add one people");
		room1.addOneToRoom();
		System.out.println("room2 decreases one people");
		room2.removeOneFromRoom();
		
		System.out.println("total people "+RoomOcpy.sum);
		
	}
}
