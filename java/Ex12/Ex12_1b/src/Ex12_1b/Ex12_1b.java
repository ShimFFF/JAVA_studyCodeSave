package Ex12_1b;

/*숫자를 단어로 변환*/

class Word{
	
	public static void displayWords(int num) {
		int a=1000000;
		
		while(num>=10) {
			
			if(num/a == 0) {
				a/=10;
				continue;}
			System.out.print(" "+ getWordFromDigit(num/a));
			num%=a;
			a/=10;
		}
		System.out.print(" "+ getWordFromDigit(num));
	}
	
	public static String getWordFromDigit(int digit) {
		
		String[]word= new String[]{
			"zero", "one", "two", "three", "four",
			"five", "six", "seven", "eight","nine"
		};
		
		return word[digit];
	}
}


public class Ex12_1b {
	
	public static void main(String [] args) {
		Word.displayWords(12345);
		
	}
	

}
