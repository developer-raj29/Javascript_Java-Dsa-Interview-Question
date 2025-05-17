public class _06reverseWords {
    public static String reverseWord(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWord(s)); // <--- Added this
    }
}
