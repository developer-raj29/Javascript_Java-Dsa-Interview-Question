public class _07LargestOddNum {

    public static String largestOddNumber(String str) {
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            if (str.charAt(i) % 2 == 1) {
                return str.substring(0, i + 1);
            }
        }

        return ""; // If no odd number is found, return an empty string
    }

    public static void main(String[] args) {
        // Example input
        String str = "52"; // Largest odd number is "5".
        // String str = "4206"; // No odd number found in the string.
        // String str = "35427"; // Largest odd number is "35427".
        // String str = "2468"; // No odd number found in the string.
        // String str = "23234"; // No odd number found in the string.

        if (largestOddNumber(str).equals("")) {
            System.out.println("No odd number found in the string.");
        } else {
            System.out.println("Largest odd number: " + largestOddNumber(str));
        }
    }
}