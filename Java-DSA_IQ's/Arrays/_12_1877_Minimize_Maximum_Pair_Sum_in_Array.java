import java.util.Arrays;

public class _12_1877_Minimize_Maximum_Pair_Sum_in_Array {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int maxPairSum = 0;
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            int pairSum = nums[i] + nums[n - 1 - i]; // Step 2: Pair smallest with largest
            maxPairSum = Math.max(maxPairSum, pairSum); // Step 3: Track the maximum pair sum
        }
        return maxPairSum;
    }

    /*
     * Approach:
     * 1. create a minPairSum function and pass nums[] array
     * 2. sort our array using Arrays.sort(nums); this method. [2,3,3,5]
     * 3. create varible int maxpairSum = 0, n = nums.length
     * 4. apply for loop and iterate from i = 0 to i < n/2; i++
     * 5. int pairSum = nums[i] + nums[n-1-i]; mean's
     * 1st current value [2] + [[4-0-1] = [3 indx] 5] = 7,
     * 2nd [3] + [[4-1-1] = [2] 3] = 6,
     * maxPairSum = 7
     * 
     * output return 7;
     * 
     * Time Complexity: O(nlogn) + O(n) = O(nlogn)
     * Space Complexity: O(1)
     */

    public static void main(String[] args) {
        int[] nums1 = { 3, 5, 2, 3 };
        System.out.println(minPairSum(nums1)); // Output: 7

        int[] nums2 = { 4, 1, 5, 1, 2, 5, 4, 3 };
        System.out.println(minPairSum(nums2)); // Output: 7
    }
}
