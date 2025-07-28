package _00_MathsProblem;

/*
* Leetcode: 1185. day of the week
*
* Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values
{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

 */

public class GuessTheDayOfWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        int q = day;
        int m = month;
        int K = year % 100;
        int J = year / 100;

        /*
        * Zeller’s Congruence
        *
        * Zeller’s Congruence Formula (for Gregorian calendar):
        * h = (q + 13*(m+1)/5 + K + K/4 + J/4 + 5*J) % 7
        *
        * Where:

q = day of the month

m = month (3 = March, 4 = April, ..., 12 = December, January and February are counted as months 13 and 14 of the previous year)

K = year % 100 (last two digits of the year)

J = year / 100 (first two digits of the year)

The result h is:

0 = Saturday

1 = Sunday

2 = Monday

3 = Tuesday

4 = Wednesday

5 = Thursday

6 = Friday

        */
        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[h];
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(28, 7, 2025));  // Output: Monday
        System.out.println(dayOfTheWeek(15, 8, 1947));  // Output: Friday
        System.out.println(dayOfTheWeek(11,12,2000));
    }
}
