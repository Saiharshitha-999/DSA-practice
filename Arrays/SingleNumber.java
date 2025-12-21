
import java.util.*;
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single number: " + solution.singleNumber(nums));
    }
}
