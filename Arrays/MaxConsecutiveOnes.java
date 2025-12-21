package Arrays;

// LeetCode 485: Max Consecutive Ones
// Approach: Single pass (counter-based)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxConsecutiveOnes {

    // Returns the maximum number of consecutive 1s in the array
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;    // stores the maximum count of consecutive 1s
        int count = 0;  // stores the current count of consecutive 1s

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;                     // increment count for consecutive 1s
                max = Math.max(max, count);  // update maximum
            } else {
                count = 0;                   // reset count when 0 is encountered
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}
