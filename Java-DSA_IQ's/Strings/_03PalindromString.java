import java.util.Scanner;

public class _03PalindromString {
    public static boolean isPalindrome(String str) {
        int st = 0, e = str.length() - 1;

        while (st < e) {
            if (str.charAt(st) != str.charAt(e)) {
                return false;
            }
            st++;
            e--;
        }

        return true;
    }

    public static boolean isPalindromes(char[] charArray) {
        int st = 0, e = charArray.length - 1;

        while (st < e) {
            if (charArray[st] != charArray[e]) {
                return false;
            }
            st++;
            e--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");

        String str = sc.next();
        char[] charArray = str.toCharArray();

        // boolean ans = isPalindrome(str);
        boolean ans = isPalindromes(charArray);
        if (ans) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        sc.close();
    }
}
