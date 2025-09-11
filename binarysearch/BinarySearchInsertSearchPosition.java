package binarysearch;
import java.util.Scanner;
public class BinarySearchInsertSearchPosition {
        public static void main(String[] args)
         {
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
        search(arr,search);
        
    
        }
        
        public static void search(int[] arr, int target) 
        {
            int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
            System.out.println("it is at "+mid);
            }
            else if(arr[mid]>target)
            {
              
                end=mid-1;
            }
            else
            {
               
                start=mid+1;
            }

        }
        System.out.println("it can be at "+start);
    }
    
}


