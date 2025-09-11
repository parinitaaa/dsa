package linearsearch;
import java.util.Scanner;
public class LinearSearchBookAllocation {
     public static int main(String[] args) 
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
        System.out.println("enter number of students");
        int k=sc.nextInt();
        sc.close();
        if(k > arr.length)
        {
             // k>number of books so allocation is not possible as every student needs to get at least one book
            return -1;
        }
        int max=0,sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
      
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int start=max,end=sum;
        for (int i = start; i <=end; i++) 
        {
            if(check(arr, i,k))
              return i;  
            
        }
        return -1;
    }
        public static boolean check(int[]arr, int i, int k)
        {
            int sum=0, student=1;
            for (int j = 0; j < arr.length; j++) 
            {
                if(sum+arr[j]<=i)
                 sum+=arr[j];
                else
                 {
                    student++;
                    sum=arr[j];
                 }
                 
                
            }
            if(student>k)
             return false;
            else
             return true;
        }
}   
    

