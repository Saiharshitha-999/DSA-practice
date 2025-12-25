
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {
        /* This is the optimal approach for the problem where they ask to return the indices of the two numbers 
            and the more optimized approach is
            => If they ask just say Yes/No if there exist the sum of the target then 
              At first we have to sort the array and then use two pointer approach by keeping one pointer at starting of the array
              and another at the end of the array
        */
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
        int element=target-nums[i]; // delete the index from the target and search that in the Hashmap  
        if(map.containsKey(element)) // If matches then return the indices of that two
        {
        return new int[]{i,map.get(element)};
        }
        map.put(nums[i],i);
        }
        return new int[]{-1,-1}; //If there is no subarray with sum==target then return {-1,-1} as indices
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

