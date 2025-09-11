package linearsearch;
import java.util.Scanner;

public class LinearSearchMinimumNo {
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
        sc.close();
        int min=linearsearch(arr);
        System.out.println("minimum number is "+ min);
        
    
}
public static int linearsearch(int[] arr)
{
    int min=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min)
        {
            min=arr[i];
        }
        
    }
    return min;
}
}

