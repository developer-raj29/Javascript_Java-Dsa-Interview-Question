public class _18_MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Add remaining elements of arr1
        while (i < n) {
            result[k++] = arr1[i++];
        }

        // Add remaining elements of arr2
        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6, 8, 10 };

        int[] merged = mergeArrays(arr1, arr2);

        // Print merged array
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
