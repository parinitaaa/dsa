import java.util.Scanner;
public class ArrayTwoSum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the sum");
        int k=sc.nextInt();
        sc.close();
        int x=0;
        
        for(int i=0;i<n-1;i++)
        {     
           for(int j=i+1;j<n;j++)
           {
             if(arr[i]+arr[j]==k)
            {
                System.out.println("pair is "+ arr[i]+ " and "+ arr[j]);
                x=1;
            }
            
            
        }
            
            
        }
        if(x==0)
        {
            System.out.println("no pair found");
        }
        
    }
    
}
