import java.util.Scanner;
public class ArrayMaxitemSumitem 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] x= new int[5];
        
        System.out.println("enter  array");  //accepting array
        for(int i=0;i<5;i++)
        {
         x[i]=sc.nextInt();
        }
        sc.close();
        max(x);
        sum(x); //calling function
        
    }
       public static void max(int[] y)
       {
        int max=y[0]; //initializing max to the first element
        for(int i=0;i<y.length;i++)
        {
            if (y[i]>max) //comparing x and (x+1)th element
             max=y[i];
        }
        System.out.println("max item is "+ max);
    }
    public static void sum(int[] y)
    {
        int sum=0;
        for(int i=0;i<y.length;i++)
        {
            sum=sum+y[i];
        }
        System.out.println("sum is "+ sum);

    }
    
}
