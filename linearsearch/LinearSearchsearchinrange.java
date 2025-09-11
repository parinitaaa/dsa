package linearsearch;
import java.util.Scanner;

public class LinearSearchsearchinrange {
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
        System.out.println("enter indexes");
        int start=sc.nextInt();
        int end=sc.nextInt();
        sc.close();
        int res=linearsearch(arr,search,start,end);
        if (res==-1)
        {
            System.out.println("item not found");
        }
        else
        System.out.println("item found at index "+res);


    
}
 public static int linearsearch(int[] arr, int search, int start, int end)
 {
    if(arr.length==0)
    {
        return -1;
    }
    for (int i = start; i < end; i++) 
    {
        if (arr[i]==search)
        {
            return i;
        }
        
    }
    return -1;

 }
}