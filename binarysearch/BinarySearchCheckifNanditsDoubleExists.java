package binarysearch;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchCheckifNanditsDoubleExists {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enterarray:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
         for(int i=0;i<arr.length;i++)
         {
            if(binarysearch(arr,i,2*arr[i]))
            {
             System.out.println("true");
             System.exit(0);
            }
         }
        System.out.println("false");
    }
        public static boolean binarysearch(int[]arr,int i, int target)
        {
        
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (mid == i)
             {
                if (arr[mid] < target) 
                    start=mid+1;
                 else 
                    end=mid-1;
                continue; 
            }
            if(arr[mid]==target)
             return true;
            else if(arr[mid]>target)
             end=mid-1;
            else
            start=mid+1;
        }
        return false;
        }
     
}    
   
    

