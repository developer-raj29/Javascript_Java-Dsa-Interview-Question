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

    public static void main(String[] args) {
        int nums[] = { 4, 2, 0, 6, 3, 2, 5 }; // Example array representing heights of bars
        System.out.println("Trapped Rain Water: " + trappingRainWater(nums));
        // Trapped Rain Water: 11
        // Call the trap method and print the result
    }
}

// // Approach 1: Precompute Left and Right Max Arrays (O(N) Time, O(N) Space)
// class Solution {
// public int trap(int[] arr) {
// int n = arr.length;
// int[] lmax = new int[n];
// lmax[0] = arr[0];
// for (int i = 1; i < n; i++)
// lmax[i] = Math.max(lmax[i - 1], arr[i]);

// int[] rmax = new int[n];
// rmax[n - 1] = arr[n - 1];
// for (int i = n - 2; i >= 0; i--)
// rmax[i] = Math.max(rmax[i + 1], arr[i]);

// int ans = 0;
// for (int i = 0; i < n; i++)
// ans += Math.min(lmax[i], rmax[i]) - arr[i];

// return ans;
// }
// }
