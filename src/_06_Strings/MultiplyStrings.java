package _06_Strings;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        // Edge case: if either number is "0", return "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length(), m = num2.length();
        int[] result = new int[n + m];

        // Multiply each digit from num1 and num2
        for (int i = n - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Convert the result array to string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("2","3"));
        System.out.println(multiply("0","3"));
        System.out.println(multiply("2","0"));

    }
}
