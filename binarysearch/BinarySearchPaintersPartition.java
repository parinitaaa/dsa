package binarysearch;
import java.util.Scanner;
public class BinarySearchPaintersPartition {
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
        System.out.println("enter number of painters");
        int k=sc.nextInt();
        sc.close();
        int max=0,sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
      
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int ans=-1,start=max,end=sum;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(check(mid,k,arr))
            {
             ans=mid;
             end=mid-1; }
             else
             start=mid+1;

        }
        System.out.println(ans);

    
}
 public static boolean check(int mid,int k,int[]arr)
 {
    int time=0, painters=1;
    for (int i = 0; i < arr.length; i++) {
        if(time+arr[i]<=mid)
             time+=arr[i];
        else{
            painters++;
            time=arr[i];
            if (painters > k) 
            return false;
        }
        
    }
   
    return true;
    

 }
}
