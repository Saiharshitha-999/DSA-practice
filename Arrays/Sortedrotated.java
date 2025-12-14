// Check if Array Is Sorted and Rotated
// Leetcode-1752
// Optimized approach
// Time complexity : O(n) , Space Complexity : O(1)

package Arrays;

import java.util.Scanner;

public class Sortedrotated {

    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sortedrotated obj = new Sortedrotated();
        boolean result = obj.check(arr);

        if (result) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is NOT sorted and rotated.");
        }

        sc.close();
    }
}
