// 1 2 3
// 4 5 6
// 7 8 9
//10 11 12
// output: 1 2 3 6 5 4 7 8 9 12 11 10
import java.util.Scanner;
public class ArrayWaveform 
{
    public static void main(String[] args)
     {
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
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)  // for even rows, it prints normally
            {
                for(int j=0;j<m;j++)
                {
               System.out.print(arr[i][j]+ " ");
                 }
             }
             else  // for odd rows, it prints the reverse of the row
             {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+ " ");
                }
             }
             
        }
       
    
    }
}
