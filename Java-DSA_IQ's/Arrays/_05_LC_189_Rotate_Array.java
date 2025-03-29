public class _05_LC_189_Rotate_Array {
    public static void rotate(int[] nums, int k) {
        // k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int st, int e) {
        while (st < e) {
            int temp = nums[st];
            nums[st] = nums[e];
            nums[e] = temp;
            st++;
            e--;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);

        int X = k % 7;
        System.out.println(X);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " "); // 6 7 1 2 3 4 5
        }
    }
}