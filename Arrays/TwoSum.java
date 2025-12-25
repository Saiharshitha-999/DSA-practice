
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
        int element=target-nums[i];
        if(map.containsKey(element))
        {
        return new int[]{i,map.get(element)};
        }
        map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

