public class _07_GFG_Linear_Search {
    public static int searchInSorted(int arr[], int N, int K) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) {
                return 1;
            }
        }
        return -1;
    }

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
        System.out.println(LinearSearch(arr, N, K)); // 1 
    }
}
