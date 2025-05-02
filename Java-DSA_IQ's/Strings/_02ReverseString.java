import java.util.Scanner;

public class _02ReverseString {
    public static void reverseString(char[] charArray) {
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        System.out.println(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        System.out.print("Reversed String: ");
        reverseString(charArray); // Reverse the char array
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
