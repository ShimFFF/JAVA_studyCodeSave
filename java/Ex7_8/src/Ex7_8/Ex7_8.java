package Ex7_8;

import java.util.Random;
import java.util.Scanner;



public class Ex7_8 {
	private static final int PIN_LENGTH = 5;

    public static void main(String[] args) {
        // random numbers for each digit
        Random rand = new Random();
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = rand.nextInt(3) + 1;
        }

        // Store PIN
        int[] pin = {1, 2, 3, 4, 5};

        // Display random numbers
        System.out.print("PIN: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("NUM: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter response: ");
        int[] response = new int[PIN_LENGTH];
        for (int i = 0; i < PIN_LENGTH; i++) {
            response[i] = scanner.nextInt();
        }

        boolean match = true;
        for (int i = 0; i < PIN_LENGTH; i++) {
            if (num[pin[i]] != response[i]) {
                match = false;
                break;
            }
        }

        if (match) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
    }
	

}
