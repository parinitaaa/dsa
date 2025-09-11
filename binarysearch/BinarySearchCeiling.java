package binarysearch;
// floor is the smallest number that is greater than the target number
// 1 4 7 9 13
// ceiling(8)=9  ceiling(12)=13  ceiling(7)=7
import java.util.Scanner;
public class BinarySearchCeiling {
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
        System.out.println("enter 1 for linear and 2 for binary");
        int x=sc.nextInt();
        sc.close();
        switch(x)
        {
            case 1: linearsearch(arr,search);
            break;
            case 2: binarysearch(arr,search);
            break;
           
        }

    }
    public static void linearsearch(int [] arr, int search)
    {
        if(search>arr[arr.length-1])
    {
        System.out.println("not valid");
        System.exit(0);
    }
        int ceiling= arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i]>=search)
            {
            ceiling=arr[i];
            break;
            }
        }
        System.out.println("ceiling= "+ ceiling);
    
}
public static void binarysearch(int [] arr, int search)
{
    if(search>arr[arr.length-1])
    {
        System.out.println("not valid");
        System.exit(0);
    }
    int start=0;
    int end =arr.length-1;
    int ceiling=-1;
    while(start<=end)
    {
        int mid= start+ (end-start)/2;
        if(arr[mid]==search)
        {
            ceiling= arr[mid];
            break; //stop searching after finding the element
        }
        else if(arr[mid]>search)
        {
            ceiling=arr[mid]; //temporarily store floor as the mid value
            end=mid-1;
        }
        else 
        start=mid+1;
        
    }
    System.out.println("ceiling= "+ ceiling);
}

}


