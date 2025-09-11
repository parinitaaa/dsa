package linearsearch;
import java.util.Scanner;
public class LinearSearch {
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
        System.out.println("enter element to search");
        int search=sc.nextInt();
        sc.close();
        int res=linearsearch(arr,search);
        if (res==-1)
        {
            System.out.println("item not found");
        }
        else
        System.out.println("item found at index "+res);

        
    }
     static int linearsearch(int []arr, int x) //return index if not found else -1
     {
        if (arr.length==0)
        {
            return -1;
        }
        for ( int i = 0; i < arr.length; i++) 
        {
            if (arr[i]== x)
            {
                return i;
            }
            
        }
        return Integer.MAX_VALUE; //this line will execute if none of the above return statements have executed
     }
}
