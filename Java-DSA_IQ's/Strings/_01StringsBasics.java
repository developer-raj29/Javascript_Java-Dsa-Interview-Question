import java.util.Scanner;

public class _01StringsBasics {

    public static int getLength(char[] charArray) {
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            count++;
        }
        return count;
    }

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
        // String declaration
        String str = "Hello, World!";
        System.out.println("String: " + str);

        // String length : str.length()
        System.out.println("Length: " + str.length());

        // Character at a specific index : str.charAt(7)
        System.out.println("Character at index 7: " + str.charAt(7));

        // Substring : str.substring(0, 5)
        System.out.println("Substring (0-5): " + str.substring(0, 5));

        // String concatenation str.concat(str2)
        String str2 = " How are you?";
        String concatenated = str.concat(str2);
        System.out.println("Concatenated String: " + concatenated);

        // String comparison : str.equals(str3)
        String str3 = "Hello, World!";
        System.out.println("Are str and str3 equal? " + str.equals(str3));

        // String to char array : str.toCharArray()

        // char[] charArray = new char[10];

        System.out.print("Enter String: ");
        // String input = sc.next(); // Print only first word : Raj
        String input = sc.nextLine(); // Print entire line including spaces : Raj Yadav

        // for (int i = 0; i < input.length() && i < 10; i++) {
        // charArray[i] = input.charAt(i);
        // }

        // // Print characters
        // for (char c = 0; c < charArray.length; c++) {
        // System.out.print(charArray[c]);
        // }

        char[] charArray = input.toCharArray(); // Convert String to char array

        System.out.print("Characters are: ");
        for (char ch = 0; ch < charArray.length; ch++) {
            System.out.print(charArray[ch]);
        }
        System.out.println();
        int Lenght = getLength(charArray); // Get length of char array
        System.out.print("Lenght is : " + Lenght);

        System.out.println();

        System.out.print("Reversed String: ");
        reverseString(charArray); // Reverse the char array
        sc.close();
    }
}