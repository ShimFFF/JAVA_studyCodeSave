package Ex7_2b;


import java.util.Scanner;



class Test{
	
	
	public static double getSum(double[][]arr, int row) {
		double sum=0;
		row--;
		for(int i=0;i<arr[row].length;i++)
			sum+=arr[row][i];
		
		return sum;
	}
	public static double getAverage(double[][] arr, int column) {
		double sum=0;
		column--;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i][column];
		return sum/arr.length;
	}
}

public class Ex7_2b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the array row : ");
		int row=sc.nextInt();
		System.out.print("Enter the array column : ");
		int column=sc.nextInt();
		
		double [][]array=new double[row][column];
		get(array, row, column);
		
		System.out.print("Enter the get sum row : ");
		int r=sc.nextInt();
		System.out.println("sum : "+Test.getSum(array, r));
		
		System.out.print("\nEnter the get average column : ");
		int c=sc.nextInt();
		System.out.println("average : "+Test.getAverage(array, c));
		
		
		
		
		
		
	}
	static void get(double [][]array, int r, int c) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("row "+(i+1)+" column "+(1+j)+" data : ");
				array[i][j]=sc.nextDouble();
			}
			
		}
	}

}
