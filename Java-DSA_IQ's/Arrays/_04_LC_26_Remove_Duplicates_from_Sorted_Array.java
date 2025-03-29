public class _04_LC_26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /*
     * Approach 1:
     * 1. We apply 2 pointer approach.
     * 2. 1st pointer is i assign value with '0' and 2nd pointer is j, which is
     * interate every index in nums array.
     * 3. check if nums[i] != nums[j], then increment i by 1 and assign nums[i] =
     * nums[j].
     * 4. After complete the loop then return i + 1.
     * 5. Time complexity is O(n) and space complexity is O(1).
     */
    public static int removeSortedDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int insertIndex = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[insertIndex - 2]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }

        return insertIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = removeDuplicates(arr);

        System.out.println("Print : " + k);
        // System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " "); // 0 1 2 3 4
        }
    }
}
