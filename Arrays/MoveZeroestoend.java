// LeetCode 283: Move Zeroes
// Approach: Two-pointer technique
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MoveZeroestoend {
    public void moveZeroes(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                
                break;
            }
        }
        for(j=i+1;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        
        }
    }
    
    public static void main(String[] args) {
        MoveZeroestoend mz=new MoveZeroestoend();
        int arr[]= {0,1,0,3,12};
        mz.moveZeroes(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
}
}

