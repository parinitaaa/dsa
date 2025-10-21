//package recursion;
import java.util.Scanner;
public class RecursionArraySorted {
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
        System.out.println(sort(arr,0));
        sc.close();
   
}
static boolean sort(int[]arr, int index)
{
    if(index==arr.length-1)
     return true;
     return (arr[index]<arr[index+1]) && sort(arr,index+1);
}
}
