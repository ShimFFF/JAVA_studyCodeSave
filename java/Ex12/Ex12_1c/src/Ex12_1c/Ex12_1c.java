package Ex12_1c;

/*숫자가 몇개 있는지 재귀사용*/



public class Ex12_1c {
	
	public static void main(String[] args) {
		
		System.out.println("Hello 12 world 345");
		System.out.println("Numder of digit is "+countDigits("Hello 12 world 345"));
	}
	
	
	public static int countDigits(String s) {
		if (s.length() == 0) {
            return 0; //base case
        } else {
            char firstChar = s.charAt(0);
            int count = countDigits(s.substring(1));
            //재귀적으로 함수를 콜하며 count에 스택이 쌓임 

            if (Character.isDigit(firstChar)) {
                count++; 
            }

            return count;
        }
	}
}
