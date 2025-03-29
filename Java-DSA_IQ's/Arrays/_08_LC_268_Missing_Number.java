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

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };

        System.out.println(missingNumber(nums)); // 2
    }
}
