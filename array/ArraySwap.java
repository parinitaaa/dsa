import java.util.Scanner;
public class ArraySwap 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int[] x= new int[3];
       
       System.out.println("enter  array"); 
       for(int i=0;i<3;i++)
       {
        x[i]=sc.nextInt();
       }
       System.out.println("enter indexes you want to swap");
       int y=sc.nextInt();
       int z= sc.nextInt();
      if(y<x.length && z<x.length)
      {
       System.out.println("Before swapping:");
       for(int i=0;i<3;i++)
       {
        System.out.print(x[i]+" ");
       }
       System.out.println(" ");
       
        swap(x,y,z);
        System.out.println("After swapping:");
       for(int i=0;i<3;i++)
       {
        System.out.print(x[i]+" ");
       }
    }
    else
    {
        System.out.println("invalid index");
    }
    sc.close();
}
        public static void swap (int[]arr, int a, int b)
        {
            int temp =arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }

       
                
            
        
        
        
        

    }
   
    

