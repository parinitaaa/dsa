//Given N array of elements,count total no. of elements which have atleast 1 element greater than itself
// -4 3 7 9 3 9 4 = 5 
// length-no. of occurences(max no.)  = 7-2=5

import java.util.Scanner;
public class ArrayTotalitemsgreaterthanitself 
{

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
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
           if(arr[i]>max)
           {
            max= arr[i];
           }
        }
        int count =0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]==max)
           {
            count++;
           }
        }
        System.out.println("total no. of elements which have atleast 1 element greater than itself is "+ (arr.length-count));
        sc.close();
    }
    
}
