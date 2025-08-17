import java.util.Scanner;

public class _06_LC_283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    /*
     * Approach:
     * 1. take 2 pointer approach.
     * 2. 1st pointer is assign with '0' and 2nd pointer is i, which is iterate
     * every using for loop,
     * 3. check if nums[i] current value != 0 zero ke equal nhi hai toh, swap kar
     * do.
     * 4. swap karne ke baad j ko increment kar do.
     * 5. After complete the loop then we get the final array.
     * 6. Time complexity is O(n) and space complexity is O(1).
     */

    public static void main(String[] args) {
        // int nums[] = { 0, 1, 0, 2, 3, 4 };
        // int[] nums = new int[] { 4, 5, 0, 1, 9, 0, 5, 0 };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int input = sc.nextInt();

        System.out.print("Enter a arr element: ");
        int arr[] = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);
        System.out.print("Your arr elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // moveZeroes(nums);

        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(nums[i] + " "); // 1 2 3 4 0 0
        // }

        // int num[] = { 0, 1 };

        // if (num[1] != 0) {
        // System.out.print("True");
        // } else {
        // System.out.print("False");
        // }

        sc.close();
    }
}