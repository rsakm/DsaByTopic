package _00_MathsProblem;

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
