public class _10_LC_136_FindUniqueNo_Single_No {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    /*
     * Approach:
     * 1. create a variable ans and initialize it to 0.
     * 2. iterate each element in the array and do XOR operation with ans and store
     * it in ans.
     * Ex: XOR operation: a ^ a= 0, a ^ 0 = a,
     * 3. return ans.
     * 4. Done.
     * 5. Time Complexity: O(N) and Space Complexity: O(1).
     */

    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2, 4, 3 };
        System.out.println(singleNumber(nums)); // 4
    }
}
