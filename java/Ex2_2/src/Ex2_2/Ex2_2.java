//문자열 한줄 입력 받아서 앞단어와 두번째 단어의 위치를 바꿈
package Ex2_2;

import java.util.Scanner;


public class Ex2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력 하세요 : ");
		String str = sc.nextLine(); //한줄 입력
		
		String[] word=str.split(" "); 
		//공백을 기준으로 단어 분리
		
		//인풋이 한 단어일 경우 생각
		if(word.length<2) {
			System.out.println("한 단어로 이루어진 입력입니다");
		}
		else { //입풋이 여러 단어인 경우
			
			//단어 위치 swap
			String temp=word[0]; 
			word[0]=word[1];
			word[1]=temp;
			
			String result = String.join(" ", word);
			System.out.println(result);
		}
		
		
	}
}
