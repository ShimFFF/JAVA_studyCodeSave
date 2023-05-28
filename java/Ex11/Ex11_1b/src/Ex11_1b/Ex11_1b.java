package Ex11_1b;

import java.time.DateTimeException;

class InvalidHourException extends DateTimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidHourException(String message) {
        super(message);
    }
}

class InvalidMinuteException extends DateTimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMinuteException(String message) {
        super(message);
    }
}

class TimeChecker{
	public static void checkHour(String hh) throws InvalidHourException {
	    int hour = Integer.parseInt(hh);
	    if (hour < 0 || hour > 23) {
	        throw new InvalidHourException("Invalid hour: " + hh);
	    }
	}

	public static void checkMinute(String mm) throws InvalidMinuteException {
	    int minute = Integer.parseInt(mm);
	    if (minute < 0 || minute > 59) {
	        throw new InvalidMinuteException("Invalid minute: " + mm);
	    }
	}
	
}

public class Ex11_1b {
	
	public static void main(String[] args) {
	    try {
	        String hour1 = "5";
	        String hour2 = "24";
	        String minute1 = "30";
	        String minute2 = "60";
	        TimeChecker.checkHour(hour1); // valid hour, no exception thrown
	        TimeChecker.checkHour(hour2); // invalid hour, throws InvalidHourException
	        TimeChecker.checkMinute(minute1); // valid minute, no exception thrown
	        TimeChecker.checkMinute(minute2); // invalid minute, throws InvalidMinuteException
	    } catch (DateTimeException e) {
	        System.out.println(e.getMessage());
	    }
	}


}
