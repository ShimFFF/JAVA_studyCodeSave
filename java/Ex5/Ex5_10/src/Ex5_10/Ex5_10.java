package Ex5_10;

import java.util.Scanner;

class Movie{
	String movieName;
	int[] score= {0,0,0,0,0};
	//score[0]의 값은 1점 매긴 사람의 수
	public void set_name(String name) {
		this.movieName=name;
	}
	public void addRating(int a) {
		this.score[a-1]++;
	}
	public float getAverage() {
		float sum=0;
		for(int i=0;i<5;i++) {
			sum+=(i+1)*score[i];
		}
		return sum/5;
	}
	public boolean equal(Movie m2) {
		if(this.movieName.equals(m2.movieName)) {
			for(int j=0;j<5;j++) {
				if(this.score[j]!=m2.score[j]) break;
			}
			return true;
		}
		return false;
	}
	
	public void setting() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Set movie name [1]\n"
				+ "Set MPAA rating [2]\n"
				+ "Print rating average [3]\n "
				+ "end [9]");
		int i=sc.nextInt();
		while(i!=9) {
			switch(i) {
			case 1:
				System.out.print("Enter movie name : ");
				this.set_name(sc.next());
				break;
			case 2:
				System.out.println("Enter rate\n"
						+ "stop add rating enter 9");
				int a=0;
				while(true) {
					a=sc.nextInt();
					if(a==9) break;
					this.addRating(a);
				}
				break;
				
			case 3:
				System.out.print("average : "+this.getAverage());
			default : 
				break;
			}
			
			System.out.println("Set movie name [1]\n"
					+ "Set MPAA rating [2]\n"
					+ "Print rating average [3]\n "
					+ "end [9]");
			i=sc.nextInt();
		}
		System.out.println("setting is end");
	}
}

public class Ex5_10 {
	public static void main(String[] args) {
		Movie movie1=new Movie(), movie2=new Movie();
		int z=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Type 1 and 2 to choose a movie");
			System.out.println("End program enter 9");
			//9면 종료
			int i=sc.nextInt();;
			while(i!=9) {
				
				switch(i) {
				case 1:
					movie1.setting();
					break;
				
				case 2:
					movie2.setting();
					break;
				
				default : 
					break;
				}
				System.out.println("Type 1 and 2 to choose a movie");
				System.out.println("End program enter 9");
				i=sc.nextInt();
				
			}	
			
			if(movie1.equal(movie2)) 
				System.out.println("movie1, movie2 are equal");
			else
				System.out.println("movie1, movie2 are different");
				
			//프로그램 종료 or restart
			System.out.println("restart enter 111 : ");
			z=sc.nextInt();
			if(z!=111) break;
		}
	}
	
}
