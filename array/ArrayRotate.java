
import java.util.Scanner;
public class ArrayRotate 
{
    public static void main(String[] args) 
    {
        int x[] =new int[9];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter k");
        int k=sc.nextInt();
        System.out.println("enter  array"); 
        for(int i=0;i<9;i++)
        {
         x[i]=sc.nextInt();
        }
 
        int start=0;
        int end=x.length-1;
         swap(x,start,end);
         swap(x,0,k-1);
         swap(x,k,x.length-1);
        System.out.println("rotated array is ");
        for(int i=0;i<9;i++)
        {
         System.out.print(x[i]+" ");
        }
        sc.close();
     }
      public static void swap(int[]x, int start, int end)
      {
        while(start<end)
        {
         int temp=x[start];
         x[start]=x[end];
         x[end]=temp;
        }
        start++;
        end--;
      }
    
}
