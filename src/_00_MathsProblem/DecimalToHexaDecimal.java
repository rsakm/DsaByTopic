package _00_MathsProblem;

public class DecimalToHexaDecimal {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0 && sb.length() < 8) {
            int hexDigit = num & 15; // Get last 4 bits (0xF)
            sb.append(hexChars[hexDigit]);
            num >>>= 4; // Unsigned right shift by 4 bits
        }

        return sb.reverse().toString();
    }
}
