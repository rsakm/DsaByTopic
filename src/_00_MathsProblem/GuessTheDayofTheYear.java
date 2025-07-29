package _00_MathsProblem;

/*

Leetcode: 1154. Day of the Year


Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD,
return the day number of the year.

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.*/

public class GuessTheDayofTheYear {
    public static int dayOfYear(String date) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        // Check for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February becomes 29 days
        }

        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        dayOfYear += day;

        return dayOfYear;
    }

    private static boolean isLeapYear(int year) {
        // Leap year if divisible by 4, but not by 100, unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-02-10"));
        System.out.println(dayOfYear("2000-12-11"));
        System.out.println(dayOfYear("2025-07-29"));
    }
}
