package binarysearch;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int n=sc.nextInt();
        System.out.println("enter column size");
        int m=sc.nextInt();
        int[][] arr= new int[n][m];
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter element to search");
        int search=sc.nextInt();
        sc.close();
        int[] res =binarysearch(arr,search);
        if(res[0]==-1)
        {
            System.out.println("element not found");
        }
        else
        System.out.println("element found at "+ Arrays.toString(res));     
    }
    public static int[] binarysearch(int [][]arr, int search)
    {
        int r=0;
        int c= arr.length-1;
        while(r<arr.length&& c>=0)
        {
            if(arr[r][c]==search)
            {
                return new int[] {r,c};
            }
            else if(arr[r][c]<search)
            {
                r++;
            }
            else
            c--;
        }
        return new int[] {-1,-1};
    }
    
}
