package binarysearch;
import java.util.Scanner;

public class BinarySearchRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter array");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        sc.close();
        int x= search(arr,target);
        System.out.println("it is at index "+x);
        
    }
  
        public static int search(int[] arr,int target) {
           int start=0;
           int end=arr.length-1;
           while(start<=end)
           {
            int mid=start+(end-start)/2;
            if (arr[mid]==target)
            return mid;
            if(arr[start]<=arr[mid]) //left side is sorted
            {
                if(arr[start]<=target && target<=arr[mid])
                {
                    end=mid-1;
                }
                else start=mid+1;
            }
            else if (arr[mid]<=arr[end]) //right side is sorted
            {
                if(arr[mid]<=target && target<=arr[end])
                {
                    start=mid+1;
                }
                else
                end=mid-1;
            }
            
           }
           return -1;
        }
    }
    

