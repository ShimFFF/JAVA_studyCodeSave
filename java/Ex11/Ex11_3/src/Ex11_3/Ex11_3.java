package Ex11_3;

import java.util.Scanner;


public class Ex11_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date in the format MM/DD: ");
        String dateStr = input.nextLine();

        try {
            String[] parts = dateStr.split("/");
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);

            String monthName = getMonthName(month);
            String dayStr = getDaySuffix(day);
            System.out.println(monthName + " " + day + dayStr);
        } catch (MonthException e) {
            System.out.println("Invalid month number: " + e.getMonth());
        } catch (DayException e) {
            System.out.println("Invalid day number: " + e.getDay());
        } catch (Exception e) {
            System.out.println("Invalid date format: " + dateStr);
        }
    }

    public static String getMonthName(int month) throws MonthException {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: throw new MonthException(month);
        }
    }

    public static String getDaySuffix(int day) throws DayException {
        if (day < 1 || day > 31) {
            throw new DayException(day);
        }
        if (day >= 11 && day <= 13) {
            return "th";
        }
        switch (day % 10) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}

class MonthException extends Exception {
    private int month;

    public MonthException(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }
}

class DayException extends Exception {
    private int day;

    public DayException(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}



