import java.util.Scanner;

public class _04GetMaxOccu {
    public static char getMaxOccur(String str) {
        int[] arr = new int[26]; // Array to store frequency of each lowercase letter

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // Only count lowercase letters
                arr[ch - 'a']++;
            }
            // If you want to handle uppercase too, we can modify this later
        }

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > 0) {
        // System.out.println((char) (i + 'a') + " : " + arr[i]);
        // }
        // }

        int max = -1, ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                ans = i;
                max = arr[i];
            }
        }

        return (char) (ans + 'a');
    }

    public static void getCharFrequencies(String str) {
        int[] arr = new int[26]; // Frequency array for a-z

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                arr[ch - 'A']++; // Also handling capital letters
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + arr[i]);
            }
        }
    }

    // public static void getCharFrequencies(String str) {
    // Map<Character, Integer> map = new LinkedHashMap<>(); // Maintain insertion
    // order

    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);

    // if (ch != ' ') { // ignoring spaces
    // map.put(ch, map.getOrDefault(ch, 0) + 1);
    // }
    // }

    // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    // System.out.println(entry.getKey() + " : " + entry.getValue());
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        char maxChar = getMaxOccur(str); // Store the result
        System.out.println("Maximum occurring character is: " + maxChar);
        // Print the result

        System.out.println("Character frequencies: ");
        getCharFrequencies(str); // Call the method to print frequencies

        sc.close();
    }
}
