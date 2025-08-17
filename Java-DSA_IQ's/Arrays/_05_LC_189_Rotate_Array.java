import java.util.Scanner;

public class _05_LC_189_Rotate_Array {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
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

    /*
     * Approach:
     * 1. create reverse function to reverse or swap 2 value's.
     * logic: nums[] , int st, int e;
     * while(st<e){
     * int temp = nums[st]; nums[st] = nums[e]; nums[e] = temp;
     * }
     * 2. call 3 times reverse function.
     * 1st call: reverse(nums, 0, nums.length - 1); // reverse the whole array.
     * 2nd call: reverse(nums, 0, k - 1); // reverse the first k elements.
     * 3rd call: reverse(nums, k, nums.length - 1); // reverse the rest of the
     * array.
     * 3. After that we get the rotated array.
     * 4. Time complexity is O(n) and space complexity is O(1).
     */

    public static void main(String[] args) {
        // int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int k = 3;
        // rotate(nums, k);

        // // int X = k % 7;
        // // System.out.println(X);

        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(nums[i] + " "); // 5 6 7 1 2 3 4
        // }

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        rotate(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}