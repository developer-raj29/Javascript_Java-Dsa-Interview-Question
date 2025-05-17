public class _08RemoveOuterMostParanethesis {
    public static String removeOuterPara(String str) {
        StringBuilder res = new StringBuilder();
        char[] a = str.toCharArray();

        int n = a.length, count = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] == '(') {
                res.append('(');
                count++;
            } else {
                if (count == 0) {
                    i++;
                } else {
                    res.append(')');
                    count--;
                }
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "(()()())";

        System.out.println(removeOuterPara(str));
    }
}
