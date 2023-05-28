//피보나치 수열 (재귀)
package Ex12_3;

import java.util.Scanner;

public class Ex12_3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to calculate: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int fibonacci = computeFibonacci(i);
            int previousFibonacci = computeFibonacci(i - 1);

            System.out.println("Fibonacci #" + i + " = " + fibonacci);

            if (i > 1) {
                double ratio = (double) fibonacci / previousFibonacci;
                System.out.println(fibonacci + "/" + previousFibonacci + " = " + ratio);
            }
        }

        scanner.close();
    }

    public static int computeFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return computeFibonacci(n - 1) + computeFibonacci(n - 2);
        }
    }

}
