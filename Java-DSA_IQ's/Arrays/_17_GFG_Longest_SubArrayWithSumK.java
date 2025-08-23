public class _17_GFG_Longest_SubArrayWithSumK {
    // Time Complexity: O(n^3) approximately.
    // Space Complexity: O(1) because we are not using any extra space.
    public static int getLongestSubarray(int[] a, long k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    // Time Complexity: O(n^2).
    public static int getLongestSubarray2(int[] a, int k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            int s = 0; // Sum variable
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 10 };
        int k = 5;
        int len = getLongestSubarray2(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
