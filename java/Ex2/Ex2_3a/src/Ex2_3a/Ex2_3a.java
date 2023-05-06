//greedy 알고리즘
//한 품목의 가격을 센트 단위로 읽음
//이때 가격은 25~100 이며, 5의 배수임
//1달러(100센트)를 지불 했을 떄 거스름돈 출력

package Ex2_3a;

import java.util.Scanner;


public class Ex2_3a {
	public static void main(String[] args) {
		int qurt=0; //quarter is 25 cents
		int dim=0; //dimes is 10 cents
		int nick=0; //nickel is 5 cents
		
		Scanner sc = new Scanner(System.in);
		System.out.print("한 품목의 가격을 입력하세요 : ");
		int price=sc.nextInt(); //가격
		
		int change=100-price;
		
		qurt=change/25;
		change=change%25;
		
		dim=change/10;
		change=change%10;
		
		nick=change/5;
		
		System.out.println("quarter : "+qurt);
		System.out.println("dimes : "+dim);
		System.out.println("nickel : "+nick);
		
		
	}
}
