package binarysearch;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter stall numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of cows");
        int k=sc.nextInt();
        sc.close();
        int max=0,min=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        int ans=-1,start=1,end=max-min;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(check(mid,k,arr))
            {
             ans=mid;
             start=mid+1; }
             else
             end=mid-1;

        }
        System.out.println(ans);

    
}
 public static boolean check(int mid,int k,int[]arr)
 {
    
    int laststallposition=arr[0], cows=1;
    for (int i = 1; i < arr.length; i++) {
        if(arr[i]-laststallposition>=mid)
        {
            cows++;
            laststallposition=arr[i];
            if (cows == k) 
            return true;
        }
    }
   
    return false;
    

 }
}

    

