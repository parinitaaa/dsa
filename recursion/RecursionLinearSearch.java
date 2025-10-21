//package recursion;
import java.util.Scanner;
public class RecursionLinearSearch {
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
        System.out.println("enter search");
        int search=sc.nextInt();
        System.out.println(search(arr,search,0));
        System.out.println("index is "+searchindex(arr,search,0));
        System.out.println("index is "+searchindexLAST(arr,search,arr.length-1));
        sc.close();
   
}
static boolean search(int[]arr,int search, int index) // to see if element is there or not
{
    if(index==arr.length)
    return false;
    return arr[index]==search || search(arr,search,index+1); //its okay if you dont find it in the other part of the array therefore OR
}
    

static int searchindex(int[]arr,int search, int index) //to return the index of the element
{
    if(index==arr.length)
    return -1;
    if(arr[index]==search)
    return index;
    return searchindex(arr,search,index+1);

}
static int searchindexLAST(int[]arr,int search, int index)
{
    if(index==-1)
    return -1;
    if(arr[index]==search)
    return index;
    return searchindexLAST(arr,search,index-1);

}
}