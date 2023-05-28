package Ex11_1a;

class InvalidTimeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTimeException(String message) {
        super(message);
    }
}

class TimeChecker {
    public static boolean checkTime(String t) throws InvalidTimeException {
        String regex = "^(1[0-2]|0?[1-9]):([0-5][0-9]) ([aApP][mM])$";
        if (!t.matches(regex)) {
            throw new InvalidTimeException("Invalid time format: " + t);
        }
        return true;
    }
}


public class Ex11_1a {
	public static void main(String[] args) {
	    try {
	        String time1 = "10:30 am";
	        String time2 = "13:00 pm";
	        TimeChecker.checkTime(time1); // valid format, no exception thrown
	        TimeChecker.checkTime(time2); // invalid format, throws InvalidTimeException
	    } catch (InvalidTimeException e) {
	        System.out.println(e.getMessage());
	    }
	}


}
