public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String str1 = "flower";
        String str2 = "flowing";
        String longestCommonPrefix = findLongestCommonPrefix(str1, str2);
        System.out.println("Longest Common Prefix: " + longestCommonPrefix);
    }
}
