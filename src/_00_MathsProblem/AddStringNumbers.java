package _00_MathsProblem;

public class AddStringNumbers {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        // Loop from end to start of both strings
        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int sum = n1 + n2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        // Test cases
        String num1 = "456";
        String num2 = "77";
        String result = addStrings(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
