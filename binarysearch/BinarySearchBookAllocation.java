package binarysearch;
import java.util.Scanner;
public class BinarySearchBookAllocation {
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
        System.out.println("enter number of students");
        int k=sc.nextInt();
        sc.close();
        if(k > arr.length)
        {
            System.out.println("-1"); // k>number of books so allocation is not possible as every student needs to get at least one book
            System.exit(0);
        }
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
    
    int pagesum=0, students=1;
    for (int i = 0; i < arr.length; i++) {
        if(pagesum+arr[i]<=mid)
             pagesum+=arr[i];
        else{
            students++;
            pagesum=arr[i];
            if (students > k) 
            return false;
        }
        
    }
   
    return true;
    

 }
}

    

