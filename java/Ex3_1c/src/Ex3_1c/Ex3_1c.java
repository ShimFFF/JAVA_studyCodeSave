//문자 입력 받기 연습
//a:4,b:3,c:2,d:1 출력

package Ex3_1c;

import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex3_1c {
	
	public static void main(String[] args) throws IOException {
		
		int key=1;
		char c;
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			
			System.out.print("If you want start program,"
					+ " Enter the 1 : ");
			key=sc.nextInt(); 
			if (key!=1) break; //프로그램 종료
			
			
			System.out.print("한 글자를 입력하세요 : ");
	        c = (char) System.in.read();
	        
	        if(c == 'a'||c=='A') System.out.println(4.0);
	        else if (c == 'b'||c=='B') System.out.println(3.0);
	        else if (c=='c'||c=='C') System.out.println(2.0);
	        else if (c=='d'||c=='D') System.out.println(1.0);
	        else System.out.println(0.0);
	        

			System.out.println("\n");
			
			
		}	
		
	} 
	
}
