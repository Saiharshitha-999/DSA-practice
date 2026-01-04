// Leetcode Problem: Sort Colors
// Approach: Dutch National Flag Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public void sortColors(int[] nums) {

        // i  -> boundary for 0's (next position where a 0 should go)
        // mid -> current index scanning the array
        // j  -> boundary for 2's (next position where a 2 should go)
        int i = 0, mid = 0, j = nums.length - 1;

        // Process elements until mid crosses j
        while (mid <= j) {

            // Case 1: nums[mid] == 0 → bring it to the front
            if (nums[mid] == 0) {
                // swap nums[i] and nums[mid]
                int temp = nums[i];
                nums[i] = nums[mid];
                nums[mid] = temp;

                i++;    // expand 0's region
                mid++;  // move forward
            }

            // Case 2: nums[mid] == 1 → it's already in correct middle region
            else if (nums[mid] == 1) {
                mid++;  // just move ahead
            }

            // Case 3: nums[mid] == 2 → bring it to the end
            else if (nums[mid] == 2) {
                // swap nums[j] and nums[mid]
                int temp = nums[j];
                nums[j] = nums[mid];
                nums[mid] = temp;

                j--;    // shrink 2's region
                // do NOT move mid here because swapped value must be checked
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        // Output the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
