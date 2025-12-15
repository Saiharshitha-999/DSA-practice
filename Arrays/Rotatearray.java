package Arrays;
import java.util.Scanner;
public class Rotatearray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(0,n-k,nums);
        reverse(n-k,n,nums);
        reverse(0,n,nums);
    }
    public void reverse(int a,int b,int[] nums)
    {
        int i=a,j=b-1;
        while(i<=j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array of elements you want to rotate :");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number of steps to rotate array: ");
        int k=s.nextInt();
        Rotatearray a=new Rotatearray();
        a.rotate(arr,k);
        System.out.println("The rotated array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

}


