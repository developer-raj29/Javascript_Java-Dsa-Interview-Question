
// Java program to count the occurrence of each letter in a long string
import java.util.HashMap;
import java.util.Map;

public class _05LetterCount {

    public static Map<Character, Integer> letterCountLongString(String str) {
        Map<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') { // Ignore spaces
                if (letterCount.containsKey(ch)) {
                    letterCount.put(ch, letterCount.get(ch) + 1);
                } else {
                    letterCount.put(ch, 1);
                }
            }
        }

        return letterCount;
    }

    public static void main(String[] args) {
        String str = "welcome to the world of programming";
        Map<Character, Integer> result = letterCountLongString(str);

        // Print the result
        System.out.println("Character count in the string: ");
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
