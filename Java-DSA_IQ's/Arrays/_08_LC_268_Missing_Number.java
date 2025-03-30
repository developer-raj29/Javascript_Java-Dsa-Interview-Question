public class _08_LC_268_Missing_Number {
    public static int missingNumber(int[] nums) {
        int N = nums.length;
        int summition = (N * (N + 1)) / 2; // (3*(3+1))/2 ; 12/2 ; 6

        int sum2 = 0;
        for (int i = 0; i < N; i++) {
            sum2 += nums[i]; // 3 + 0 + 1 ; 4
        }

        return summition - sum2; // 6 - 4; 2
    }

    /*
     * Approach:
     * 1. find length of array and store it N.
     * 2. find the summation of using formula (N*(N+1))/2.
     * 3. create a variable sum2 and initialize it to 0.
     * 4. iterate each element in the array and add each element to sum2 and store also.
     * 5. return summition - sum2.
     * 6. Done. 
     * 7. Time Complexity: O(N) and Space Complexity: O(1).
     */

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };

        System.out.println(missingNumber(nums)); // 2
    }
}
