package binarysearch;
// floor is the greatest number that is less than the target number
// 1 4 7 9 13
// floor(8)=7  floor(12)=9  floor(7)=7
import java.util.Scanner;
public class BinarySearchFloor {
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
        if(search<arr[0])
        {
            System.out.println("not valid");
            System.exit(0);
        }
        int floor= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=search)
            floor=arr[i];
            
        }
        System.out.println("floor= "+ floor);
    
}
public static void binarysearch(int [] arr, int search)
{
    if(search<arr[0])
    {
        System.out.println("not valid");
        System.exit(0);
    }
    int start=0;
    int end =arr.length-1;
    int floor=arr[0];
    while(start<=end)
    {
        int mid= start+ (end-start)/2;
        if(arr[mid]==search)
        {
            floor= arr[mid];
            break; //stop searching after finding the element
        }
        else if(arr[mid]<search)
        {
            floor=arr[mid]; //temporarily store floor as the mid value
            start=mid+1;
        }
        else 
        end=mid-1;
        
    }
    System.out.println("floor= "+ floor);
}
}
