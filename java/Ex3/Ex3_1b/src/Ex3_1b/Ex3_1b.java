//조건 외의 값 입력 받았을 경우
//에러 출력
//조건 : 1~100 사이, 5의 배수, 25 이상
//greedy

package Ex3_1b;

import java.util.Scanner;

public class Ex3_1b {
	public static void main(String[] args) {
		int qurt=0; //quarter is 25 cents
		int dim=0; //dimes is 10 cents
		int nick=0; //nickel is 5 cents
		
		int key=1;
		int index=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("If you want start program,"
					+ " Enter the 1 : ");
			key=sc.nextInt(); 
			if (key!=1) break; //프로그램 종료
			
			index=0;

			System.out.print("Enter the price : ");
			int price=sc.nextInt(); //가격
			
			
			//모든 에러를 출력할 수 있도록
			if(price<25) {
				System.out.println("error : cost must not less than 25 cents");
				index++;
			}
			if((price%5)!=0) {
				System.out.println("error : cost must multiple of 5");
				index++;
			}
			if(price>100) {
				System.out.println("error : cost must less than 1 dollar");
				index++;
			}
			
			if(index>=1) continue; //에러 있을 시 프로그램 재시작
			
			int change=100-price;
			
			qurt=change/25;
			change=change%25;
			
			dim=change/10;
			change=change%10;
			
			nick=change/5;
			
			System.out.println("quarter : "+qurt);
			System.out.println("dimes : "+dim);
			System.out.println("nickel : "+nick);
			

			System.out.println("\n\n");
			
		}

		
	}
}
