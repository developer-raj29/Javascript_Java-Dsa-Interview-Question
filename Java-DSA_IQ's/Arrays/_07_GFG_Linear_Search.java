public class _07_GFG_Linear_Search {
    public static boolean linearSearch(int arr[], int N, int K) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) {
                return true;
            }
        }
        return false;
    }

    /*
     * Approach:
     * 1. We apply linear search to find the element in the array.
     * 2. Iterate every value in every index
     * 3. check if arr[i] == k, then return true.
     * 4. If not found value or key then return false.
     * 5. Time complexity is O(n) and space complexity is O(1).
     * 6. This is the best approach to find the element in the array.
     */

    public static int LinearSearch(int arr[], int N, int K) {
        int i = 0;
        while (i < N) {
            if (arr[i] == K) {
                return 1;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6 };
        int N = 5, K = 6;

        // System.out.println(searchInSorted(arr, N, K));
        System.out.println(linearSearch(arr, N, K)); // true
    }
}
