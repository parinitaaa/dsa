//*********
// *******
//  *****
//   ***
//    *

   
import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        sc.close();
        pattern1(row);
      
    }
    public static void pattern1(int row)
    {
        for(int i=row;i>0;i--)
        {
            for(int j=1;j<=row-i;j++)
            {
             System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
               System.out.print("*");
            }
            
            System.out.println(" ");
        }
       

    }
}
