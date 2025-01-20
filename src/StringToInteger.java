public class StringToInteger {
    public static int stringToInteger(String numberStr) {
        int result = 0;
        boolean isNegative = numberStr.charAt(0) == '-';
        int startIndex = isNegative ? 1 : 0;

        for (int i = startIndex; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            result = result * 10 + digit;
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        String numberStr = "-12345";
        int result = stringToInteger(numberStr);
        System.out.println("The integer value is: " + result);
    }
}
