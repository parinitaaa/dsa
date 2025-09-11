import java.util.Scanner;
public class ArrayReversing 
{
    public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
       int[] x= new int[5];
       System.out.println("enter  array"); 
       for(int i=0;i<5;i++)
       {
        x[i]=sc.nextInt();
       }

       int start=0;
       int end=x.length-1;

       while(start<end)
       {
        swap(x,start,end);
        start++;
        end--;
       }

       System.out.println("reversed array is ");
       for(int i=0;i<5;i++)
       {
        System.out.print(x[i]+" ");
       }
       sc.close();
    }
     public static void swap(int[]x, int start, int end)
     {
        int temp=x[start];
        x[start]=x[end];
        x[end]=temp;
     }
}
