public class _15_TrappingRainWater {
    public static int trappingRainWater(int height[]) {
        int n = height.length; // Get the length of the heights array
        int leftMax[] = new int[n]; // Array to store the maximum height to the left of each bar
        leftMax[0] = height[0]; // Initialize the first element of leftMax
        
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]); // Calculate the maximum height to the left of each bar
        }

        int rightMax[] = new int[n]; // Array to store the maximum height to the right of each bar
        rightMax[n - 1] = height[n - 1]; // Initialize the last element of rightMax
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // Calculate the maximum height to the right of each bar
        }

        int trappedWater = 0; // Variable to store the total trapped water
        for (int i = 0; i < n; i++) {
            // Calculate the water trapped at the current bar
            int waterAtCurrentBar = Math.min(leftMax[i], rightMax[i]) - height[i];

            if (waterAtCurrentBar > 0) { // If there is water trapped at the current bar
                trappedWater += waterAtCurrentBar; // Add it to the total trapped water
            }
        }

        return trappedWater; // Placeholder return statement
    }

    /*
     * Approach:
     * 1. Create a function trappingRainWater that takes an array of heights as input.
     * 2. Initialize two arrays leftMax and rightMax to store the maximum heights to the left and right of each bar.
     * 3. LeftMax[0] is initialized to the height of 1st bar. Ex: leftMax[0] = height[0].
     * 4. Apply loop to fill leftMax array. from i = 1 to i<n, i++; LeftMax[i] = max(height[i], leftMax[i-1]).
     * 5. RightMax[n-1] is initialized to the height of last bar. Ex: rightMax[n-1] = height[n-1].
     * 6. Apply loop to fill rightMax array. from i = n-2 to i>=0, i--; RightMax[i] = max(height[i], rightMax[i+1]).
     * 7. Initialize a variable trappedWater to 0 to store the total trapped water.
     * 8. Apply loop to calculate water trapped at each bar. from i = 0 to i<n, i++; waterAtCurrentBar = min(leftMax[i], rightMax[i]) - height[i].
     * 9. If waterAtCurrentBar > 0, add it to trappedWater. Ex: trappedWater += waterAtCurrentBar.
     * 10. Return trappedWater as the result.
     * 11. The time complexity of this approach is O(N) and the space complexity is O(N).
     * 12. The space complexity can be reduced to O(1) by using two pointers instead of two arrays.
     */

    // Approach 2: Two Pointers (O(N) Time, O(1) Space)
    public static int trap(int[] arr) {
        int n = arr.length;
        int[] lmax = new int[n];
        lmax[0] = arr[0];

        for (int i = 1; i < n; i++)
            lmax[i] = Math.max(lmax[i - 1], arr[i]);

        int[] rmax = new int[n];
        rmax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--)
            rmax[i] = Math.max(rmax[i + 1], arr[i]);

        int ans = 0;
        
        for (int i = 0; i < n; i++)
            ans += Math.min(lmax[i], rmax[i]) - arr[i];

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 2, 0, 6, 3, 2, 5 }; // Example array representing heights of bars
        System.out.println("Trapped Rain Water: " + trappingRainWater(nums));
        // Trapped Rain Water: 11
        // Call the trap method and print the result
    }
}

// // Approach 1: Precompute Left and Right Max Arrays (O(N) Time, O(N) Space)
// class Solution {



// }
