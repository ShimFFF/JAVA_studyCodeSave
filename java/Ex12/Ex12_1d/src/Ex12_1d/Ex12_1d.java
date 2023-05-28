package Ex12_1d;

//palindrome 찾기
//Character.compare()
//s.CharAt

public class Ex12_1d {
	
	public static void main(String[] args) {
		
		//test case
		System.out.println("radar");
		if(checkPalindrome("radar")) {
			System.out.println("Palindrome !!");
		}else System.out.println("not Palindrome");
		
		System.out.println("\n\nStraw? No, too stupid a fad, I put soot on warts.");
		if(checkPalindrome("Straw? No, too stupid a fad, I put soot on warts.")) {
			System.out.println("Palindrome !!");
		}else System.out.println("not Palindrome");
		
		System.out.println("\n\nHello world");
		if(checkPalindrome("Hello world")) {
			System.out.println("Palindrome !!");
		}else System.out.println("not Palindrome");
		
	}
	
	//palindrome 찾기
	public static boolean checkPalindrome(String s) {
		if(s.length()<=1) {return true;} //끝까지 감->Palindrome임
		int front=0;
		int back=s.length()-1;
		
		//양 옆에서 알바벳을 뽑아옴
		while(!isApbt(s.charAt(front))) {front++;}
		while(!isApbt(s.charAt(back))) {back--;}
		
		if(front>=back) return true; //front>=back면 끝난 거임
		
		char frontChar = Character.toLowerCase(s.charAt(front));
        char backChar = Character.toLowerCase(s.charAt(back));
		
		if(frontChar==backChar) {
			//잘라서 넣어줘
			return checkPalindrome(s.substring(front+1, back));}
		
		
		return false;
	}
	
	//알파벳 판별 메서드
	public static boolean isApbt(char c) {
		return Character.isLetter(c);
	}
}
