package binarysearch;
//not dependent on the order of elements
// order agnostic is when we dont know if its sorted in the ascending or descending order
import java.util.Scanner;
public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter array");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search for");
        int search=sc.nextInt();
        sc.close();
        int res=0;
        if(arr[0]<=arr[arr.length-1])
        {
             res= ascendingbinarysearch(arr,search);
        }
        else if(arr[0]>=arr[arr.length-1])
        {
             res= descendingbinarysearch(arr,search);
        }
        if(res ==-1)
        {
            System.out.println("element not found");
        }
        else
        System.out.println("element found at index "+ res +" or the "+(res+1)+"th place");
        

    }
    public static int ascendingbinarysearch(int[]arr, int search)
    {
       int start = 0;
       int end = arr.length-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2; // (start+end)/2 might exceed int range for large values
           if(search<arr[mid])
           {
               end=mid-1;
           }
           else if (search>arr[mid])
           {
               start=mid+1;
           }
           else {
               return mid; // 
           }
       }
       return -1; //if the while loop fails, it means element was not found then -1 will be returned
    }
    public static int descendingbinarysearch(int[]arr, int search)
    {
       int start = 0;
       int end = arr.length-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2; // (start+end)/2 might exceed int range for large values
           if(search<arr[mid])
           {
               start=mid+1;
           }
           else if (search>arr[mid])
           {
              end=mid-1;
           }
           else {
               return mid; // 
           }
       }
       return -1; //if the while loop fails, it means element was not found then -1 will be returned
    }
}
