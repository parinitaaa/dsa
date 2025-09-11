package linearsearch;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2D {
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
        int[] res =linearsearch(arr,search);
        if(res[0]==-1)
        {
            System.out.println("element not found");
        }
        else
        System.out.println("element found at "+ Arrays.toString(res));
        

        
    }
     static int[] linearsearch(int [][]arr, int x) 
     {
        if (arr.length==0)
        {
           return new int[] {-1,-1}; // int is the object which is an array of values -1 and -1
        }
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
        {
            if (arr[i][j]== x)
            {
                return new int[] {i,j}; //returns the indices as a 2D array
            }
        }
            
        }
        return new int[] {-1,-1};
     }
}

    


