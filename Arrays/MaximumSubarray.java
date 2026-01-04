// LeetCode Problem 53 - Maximum Subarray
// Approach: Optimized (Kadane's Algorithm)
// Time Complexity: O(n) — single pass through the array
// Space Complexity: O(1) — constant extra space

class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;                // Current running sum of subarray
        int max = Integer.MIN_VALUE; // Maximum sum found so far

        // Iterate through all elements
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];  // Add current element to running sum

            // Update max if current sum is greater
            // Important: This must come BEFORE resetting sum,
            // otherwise arrays with all negative numbers would return 0 incorrectly
            if (sum > max) {
                max = sum;
            }

            // If running sum becomes negative, reset it to 0
            // Because continuing a negative sum will only decrease future subarray sums
            if (sum < 0) {
                sum = 0;
            }
        }

        // Return the maximum sum of any contiguous subarray
        return max;
    }
}
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = solution.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }


