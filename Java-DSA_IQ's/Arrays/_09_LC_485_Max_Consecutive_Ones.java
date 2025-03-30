public class _09_LC_485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        // int i = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxVal = Math.max(maxVal, count);
        }
        return maxVal;
    }
    // while (i < nums.length) {
    // if (nums[i] == 1) {
    // count++;
    // } else {
    // count = 0;
    // }
    // // Maxi = Math.max(Maxi, count);
    // i++;

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums)); // output = 3
    }
}
