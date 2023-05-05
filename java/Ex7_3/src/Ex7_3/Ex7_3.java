package Ex7_3;

import java.util.Scanner;



public class Ex7_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] anArray;
		System.out.print("Enter array length : ");
		int len= sc.nextInt();
		anArray=new int[len];
		
		for(int i=0;i<len;i++) {
			System.out.print("number "+(i+1)+ " value : ");
			anArray[i]=sc.nextInt();
		}
		
		// Call bubbleSort to sort the array
		bubbleSort(anArray);
		
		System.out.println("\nBuble sort\n");
		for(int i=0;i<len;i++) {
			System.out.print(anArray[i]+" ");
		}
		
	}
	
	public static void bubbleSort(int[] a) {
		boolean sorted = false;
		int temp;
		
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < a.length - 1; i++) {
				if(a[i] > a[i + 1]) {
					// Swap elements
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		
		for (int index = startIndex + 1; index < a.length; index++) {
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				// min is smallest of a[startIndex] through a[index]
			}
		}
		
		return indexOfMin;
	}
	
	private static void interchange(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; // original value of a[i]
	}

}
