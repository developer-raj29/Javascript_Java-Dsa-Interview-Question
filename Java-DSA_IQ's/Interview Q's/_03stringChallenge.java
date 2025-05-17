public class _03stringChallenge {
    public static String stringChallenge(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Convert letter to lowercase, then to alphabet index (a=1, b=2, ..., z=26)
                int pos = Character.toLowerCase(ch) - 'a' + 1;
                result.append(pos);
            } else {
                // Keep other characters (digits, symbols, spaces) as-is
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringChallenge("hello 45")); // Output: 85121215 45
        System.out.println(stringChallenge("jaj-a")); // Output: 10110-1
        System.out.println(stringChallenge("af5c a#!")); // Output: 1653 1#1
    }
}