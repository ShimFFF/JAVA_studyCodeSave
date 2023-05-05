package Ex7_2a;



class Asorter
{
	public static void selectionSort(int[] anArray){
			for (int index = 0; index < anArray.length - 1; index++) 
				{ // Place the correct value in anArray[index] 
				int indexOfNextSmallest = getIndexOfSmallest(index, anArray); 
				interchange(index, indexOfNextSmallest, anArray); 

}
}
/**
Returns the index of the smallest value in the portion of the
array that begins at the element whose index is startIndex and
ends at the last element.
*/
	private static int getIndexOfSmallest(int startIndex, int[] a){
		int min = a[startIndex]; 
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++){
			if (a[index] < min){
				min = a[index];
				indexOfMin = index;
				}
			}
		return indexOfMin;
	}
	private static void interchange(int i, int j, int[] a)
	 {
	 int temp = a[i];
	 a[i] = a[j];
	 a[j] = temp; //original value of a[i]
	 }
	
}

public class Ex7_2a {
	public static void main(String[] args){
		
		int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
		display(b, "before");
		Asorter.selectionSort(b);
		display(b, "after");
	}
	
	public static void display(int[] array, String when){
		System.out.println("Array values " + when + " sorting:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println( );
	}
	

}
