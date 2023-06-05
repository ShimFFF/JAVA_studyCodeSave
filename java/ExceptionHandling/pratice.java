package ExceptionHandling;
//InvalidTimeException class (static) 만들기
//시간, 분 단위 넘어가면 예외
//CheckTime은 hh:mm xx 리턴함(xx는  pm, am)



public class pratice {
	
	public static void main(String [] args) {
		
		String s1= "14:23 am";
		String s2= "11:16 PM";
		String s3= "08:60 AM";
		System.out.println(s1+"\n"+s2+"\n"+s3);
		
		try {
			pratice.checkTime(s1);
		}catch(InvalidTimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			pratice.checkTime(s2);
		}catch(InvalidTimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			pratice.checkTime(s3);
		}catch(InvalidTimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	//hh:mm xx폼으로 입력 받음
	public static void checkTime(String t) throws InvalidTimeException {
		//정규 표현식에서는 |를 사용하여 "OR" 연산을 수행하며, 논리 연산자 ||는 조건문에서 사용
		String rgx="^(1[0-2]|0?[0-9]):([0-5][0-9]) [APap][Mm]$";
				//^은 문자열 시작, $은 문자열 끝
		//a?b는 "a가 0 또는 1번 나타날 수 있고, 그 뒤에 b가 나와야 한다
		
		if(!t.matches(rgx))
			throw new InvalidTimeException("Time fomat exception "+t);
	}
	

}

class InvalidTimeException extends Exception{
	
	public InvalidTimeException() {
		super("there value is don't exist"); //에러 잡힘?
	}
	public InvalidTimeException(String message) {
		super(message);
	}
}
