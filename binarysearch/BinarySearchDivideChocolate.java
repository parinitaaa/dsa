package binarysearch;
import java.util.Scanner;
public class BinarySearchDivideChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter sweetness");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of friends");
        int k=sc.nextInt();
        sc.close();
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {                    
            sum+=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        int ans=-1;
        int start=min;
        int end=sum;
        while(start<=end)
        {
            int mid= start+ (end-start)/2;
            if(check(mid,arr,k))
            {
              ans=mid;
             start=mid+1;
            }
            else
            end=mid-1;

        }
        System.out.println(ans);
    
}
public static boolean check(int mid, int[]arr, int k) //k is the amount of friends
{
    int sum=0,pieces=1;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        if (sum >= mid) { // If the current piece's sweetness is at least mid
            pieces++;
            sum = 0; // Start a new piece
        }
    }
    
    return pieces > k; // We need more than k pieces

}
}
