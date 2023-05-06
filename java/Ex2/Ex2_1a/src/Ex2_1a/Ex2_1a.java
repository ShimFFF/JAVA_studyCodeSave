package Ex2_1a;
//4자릿수 정수 입력
//각 자릿수에 해당되는 정수 출력

import java.util.Scanner;

public class Ex2_1a {
	public static void main(String args[]) {
		
		System.out.print("Enter four-digit integer : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1000;i>0;i=i/10) {
			System.out.println(num/i); //먼저 출력
			num=num%(i*(num/i)); //출략한 자릿수를 뺀 수 할당
		}
		
	}

}
