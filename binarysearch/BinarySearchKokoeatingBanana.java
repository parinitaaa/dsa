package binarysearch;
import java.util.Scanner;

public class BinarySearchKokoeatingBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr= new int [n];
        System.out.println("enter array");
       for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
        
       }
       System.out.println("enter hours");
       int h= sc.nextInt();
       sc.close();
       int start=1;
       int max=0, ans=-1;
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max)
         max=arr[i];
       }
       int end=max;
       while(start<=end)
       {
        int mid=start+(end-start)/2;
        if(check(arr,mid,h))
          {
            ans=mid;
            end=mid-1;
          }
        else
         start=mid+1;
       }
       System.out.println("answer is "+ans);
    }
    
    public static boolean check(int[] arr, int mid, int h)
    {
        int hourlysum=0;
        for (int i:arr) {
            hourlysum+=(i/mid);  
            if(i%mid!=0)
             hourlysum++;
            if(hourlysum>h)
             return false;
        }
         return true;

    }
}
