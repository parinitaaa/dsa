package binarysearch;
import java.util.Scanner;

public class BinarySearchCapacitytoshipPackagesinDdays
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of days");
        int k=sc.nextInt();
        sc.close();
        int sum=0,max=0;
        for(int i:arr)
        {
            sum+=i;
            if(i>max)
            max=i;
        }
        int start=max, end=sum,ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(check(arr,mid,k))
            {
                ans=mid;
                end=mid-1;
            }
            else
             start=mid+1;
        }
        System.out.println(ans); 
}
public static boolean check(int[]arr, int mid, int k)
{
    int weightsum=0, day=1;
    for(int i:arr)
    {
        if(weightsum+i<=mid)
            weightsum+=i;
        else{
            day++;
            weightsum=i;
            if(day>k)
             return false;
        }   
    }
    return true;
}
}