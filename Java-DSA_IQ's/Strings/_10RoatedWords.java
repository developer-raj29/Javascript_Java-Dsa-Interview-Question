public class _10RoatedWords {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder result = new StringBuilder();

        String[] words = str.split(" "); // Split the sentence into words

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder();

            // Reverse each word manually
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }

            result.append(reversedWord);

            // Add space between words (except after the last word)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
