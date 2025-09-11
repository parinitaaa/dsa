package binarysearch;
//every element occurs twice except for one element, find that unique element
// 4 4 1 1 6 6 7 9 9 2 2  its not sorted; ans=7
//https://www.youtube.com/watch?v=_yecPg3u05A&list=PLmM0bg5v6gKFMhJ9vn2MwxVm2TUNU42VU&index=20

import java.util.Scanner;

public class BinarySearchUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter array");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        binarysearch(arr);
    
}
public static void binarysearch(int[]arr)
{
    if( arr[0]!=arr[1])
     System.out.println("unique element is "+ arr[0]); // if first element is unique
    else if(arr[arr.length-1]!=arr[arr.length-2])
     System.out.println("unique element is "+ arr[arr.length-1]);
     else
     { // if last element is unique
     int start=2;
     int end=arr.length-3;
     int unique=-1;
     while(start<=end)
     {
        int mid= start+ (end-start)/2;
        if(arr[mid]==arr[mid-1])
        {
         mid--; //making sure mid is in the first occurence
        }
         if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
         {
            unique=arr[mid];
            break;
         }
         if(mid%2==0) // if mid index is even, it means there are no unique elements to the left of it, therefore go right
        
         {
            start=mid+2; 
         }
         else
         end=mid-1;
     
     

   }
   System.out.println("unique element is "+unique);
}
}
}
