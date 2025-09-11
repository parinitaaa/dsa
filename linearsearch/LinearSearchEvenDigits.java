package linearsearch;
// return number of elements with even number of digits
import java.util.Scanner;
public class LinearSearchEvenDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] nums= new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        sc.close();
        int res = findNumbers(nums);
        System.out.println("total number of numbers with even digits  are "+ res);
        
    }
    public static int findNumbers(int[] nums)
     {
        
        int even=0;
            for(int i=0;i<nums.length;i++)
            {
                int count=0;
                while(nums[i]>0)
                {
                     nums[i]=nums[i]/10;
                     count++;
                }
                if(count%2==0 && count!=0)
                {
                    even++;
                }
            }  
           return even;
    }
    
}