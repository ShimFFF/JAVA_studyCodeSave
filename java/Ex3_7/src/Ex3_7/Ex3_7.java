package Ex3_7;

import java.util.Scanner;

public class Ex3_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the initial velocity of the ball: ");
        float velo = sc.nextFloat();
        float hei = 0;
        int boun = 0;
        
        for (int time = 0; boun < 5; time++) {
            if (hei < 0 && velo < 1) {
                // 공이 움직이지 않고
            	//땅에 닿으면 중지
                break;
            }
            
            System.out.println("Time: " + time + "  Height: " + hei);
            hei += velo;
            velo -= 32;
            
            if (hei < 0) {
                // 공이 땅에 떨어짐
                hei *= -0.5;
                velo *= -0.5;
                System.out.println("Bounce!");
                boun++;
            }
        }
		
		
	}
}
