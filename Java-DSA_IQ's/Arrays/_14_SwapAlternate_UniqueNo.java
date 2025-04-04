public class _14_SwapAlternate_UniqueNo {

    /*
     * Function to swap alternate elements in an array
     * Time Complexity: O(n), Space Complexity: O(1): -> Best Approach
     * Swapping alternate elements in an array means swapping the first element with
     * the second, the third with the fourth, and so on.
     */

    public static void swapAlternate(int arr[]) {
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n; i += 2) {
            if (arr[i] < n) {
                // Swap the current element with the next element
                int temp = arr[i]; // Store the current element in a temporary variable
                arr[i] = arr[i + 1]; // Assign the next element to the current position
                arr[i + 1] = temp; // Assign the temporary variable to the next position
            }
        }
    }

    /*
     * Time Complexity: O(n), Space Complexity: O(1): -> Best Approach
     * Function to find the unique number in an array where every element appears
     * twice except one
     */
    public static int uniqueNo(int nums[], int n) {
        int ans = 0; // Initialize ans to 0
        for (int i = 0; i < n; i++) {
            ans = ans ^ nums[i]; // XOR all elements in the array, when a ^ a = 0 , a ^ 0 = a
        }
        // System.out.println("Unique Number: " + ans); // Print the unique number
        return ans; // Return the unique number
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Example array
        swapAlternate(arr); // Call the swapAlternate method to swap elements

        System.out.print("Swap Alternate Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print the swapped array
            // Output : Swap Alternate Array: [2, 1, 4, 3, 6, 5, 8, 7, 10, 9]
        }
        System.out.println();

        int nums[] = { 1, 3, 4, 1, 3 };
        int n = nums.length; // Get the length of the array
        System.out.println("Unique Number: " + uniqueNo(nums, n)); // Print the unique number
        // Output : Unique Number: 4
    }
}
