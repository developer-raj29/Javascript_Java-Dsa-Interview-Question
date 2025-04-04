public class _13_MaxiumSubArray_Sum {
    // Time Complexity: O(n^3), Space Complexity: O(1) : -> Brute Force Approach
    public static void maximumSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
        int currentSum = 0; // Initialize currentSum to 0
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int st = i; // Start of the subarray
            for (int j = i + 1; j < n; j++) {
                int end = j; // End of the subarray
                currentSum = 0;
                for (int k = st; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    currentSum = currentSum + arr[k]; // Calculate the sum of the subarray
                }
                System.out.println(" = " + currentSum);
                if (maxSum < currentSum) { // If the current sum is greater than maxSum
                    maxSum = currentSum; // Update maxSum
                }
            }
        }
        System.out.println("MAXIMUM Sub Array Sum O(n^3): " + maxSum); // Print the maximum subarray sum
    }

    // Time Complexity: O(n^2), Space Complexity: O(n) : -> Optimized Approach
    // Time Complexity: O(n^2) + O(n) = O(2n^2) = O(n^2)
    public static void maximumSubArrayPrefixSum(int arr[]) {
        int currSum = 0; // Initialize currentSum to 0
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
        int Prefix[] = new int[arr.length]; // Create a prefix sum array
        Prefix[0] = arr[0]; // Initialize the first element of the prefix sum array

        for (int i = 1; i < arr.length; i++) { // Time Complexity: O(n)
            Prefix[i] = Prefix[i - 1] + arr[i]; // Calculate the prefix sum
            /*
             * Ex: arr[] = {2, 4, 6, 8, 10}
             * 2 , 2+4, 2+4+6, 2+4+6+8, 2+4+6+8+10
             * Prefix[] = {2, 6, 12, 20, 30} Ans = 30
             */
        }
        for (int i = 0; i < arr.length; i++) { // Time Complexity: O(n^2)
            int st = i; // Start of the subarray
            for (int j = i; j < arr.length; j++) {
                int end = j; // End of the subarray
                currSum = st == 0 ? Prefix[end] : Prefix[end] - Prefix[st - 1];
                // Calculate the sum of the subarray using prefix sum
                if (maxSum < currSum) { // If the current sum is greater than maxSum
                    maxSum = currSum; // Update maxSum
                }
            }
        }
        // Time Complexity: O(n^2) + O(n) = O(2n^2) = O(n^2)
        // Space Complexity: O(n) + O(1) = O(n)
        System.out.println("MAXIMUM Sub Array Sum Using Prefix Array O(n^2): " + maxSum);
        // Print the maximum subarray sum
    }

    // Time Complexity: O(n), Space Complexity: O(1): -> Best Approach
    // Kadans Algorithm
    public static void maxSumArrayKadansAlgo(int arr[]) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
        int currSum = 0; // Initialize currentSum to 0

        for (int i = 0; i < arr.length; i++) { // Time Complexity: O(n)
            currSum += arr[i]; // Add the current element to currentSum
            if (currSum < 0) {
                currSum = 0; // If currentSum becomes negative, reset it to 0
            }
            maxSum = Math.max(maxSum, currSum); // Update maxSum if currentSum is greater
        }
        System.out.println("MAXIMUM Sub Array Sum Using Kadans Algorithm O(n): " + maxSum); // Print the maximum
                                                                                            // subarray sum
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        maximumSubArraySum(arr); // output = 30 MAXIMUM Sub Array Sum O(n^3): 30
        maximumSubArrayPrefixSum(arr); // output = 30 MAXIMUM Sub Array Sum Using Prefix Array O(n^2): 30
        maxSumArrayKadansAlgo(arr); // MAXIMUM Sub Array Sum Using Kadans Algorithm O(n): 30
    }
}
