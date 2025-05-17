import java.util.Arrays;

public class _09LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        // if (str == null || str.length == 0) {
        // return "";
        // }

        // String prefix = str[0];

        // for (int i = 1; i < str.length; i++) {
        // while (str[i].indexOf(prefix) != 0) {
        // prefix = prefix.substring(0, prefix.length() - 1);
        // if (prefix.isEmpty()) {
        // return "";
        // }
        // }
        // }

        // return prefix;

        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length - 1];
        int indx = 0;

        while (indx < str1.length()) {
            if (str1.charAt(indx) != str2.charAt(indx)) {
                break;
            }
            indx++;
        }

        return str1.substring(0, indx);
    }

    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(str)); // Output: "fl"
    }
}
