package Arrays;
// LeetCode 268: Missing Number
// Approach: XOR method
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MissingNumber{
    
    // Function to find the missing number using XOR
    public int missingNumber(int[] nums) {
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        // XOR all elements in the array
        for (int num : nums) {
            xor ^= num;
        }

        // Resulting XOR is the missing number
        return xor;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();

        int[] nums = {3, 0, 1};
        int missing = solution.missingNumber(nums);
        System.out.println("Missing number: " + missing);

        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums2));

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number: " + solution.missingNumber(nums3));
    }
}

