public class _10_LC_136_FindUniqueNo_Single_N0 {
    public static int singleNumber(int[] nums) {
        int ans = 0, n = nums.length, i = 0;
        // for(int i = 0 ; i < n ; i++){
        // ans= ans^nums[i];
        // }
        while (i < n) {
            ans = ans ^ nums[i];
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums)); // 4
    }
}
