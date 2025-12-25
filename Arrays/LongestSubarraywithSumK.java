import java.util.HashMap;

class Solution {
    public static int longestSubarray(int[] arr, int k) {
        /* This is the optimized problem for the array which have
        positives,negatives and zeroes not optimized approach other than this
        Using hashmap
        */
        HashMap<Integer,Integer> map=new HashMap<>();
        int Prefixsum=0;
        int maxlength=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            Prefixsum+=arr[i];
            if(Prefixsum==k)
            {
                maxlength=Math.max(maxlength,i+1);// we check Math.max becoz we dont need to update the length when the sub array is small
            }
            if(map.containsKey(Prefixsum-k)) // Prefixsum-h=k, where h=The sum that corresponding index+1 onwards our actual subarray starts
            {
                int len=i-map.get(Prefixsum-k);
                maxlength =Math.max(maxlength,len);
            }
    
            if(!map.containsKey(Prefixsum)) // Here we check if the prefix sum is already existed in the array
            {
                map.put(Prefixsum,i);  // if existed we don't need to overwrite that becoz it decreases the length of the longest sub array
            }

        }
        return maxlength;
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
    
        

}

