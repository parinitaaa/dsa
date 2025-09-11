//     *
//    ***
//   *****
//  *******
// *********


import java.util.Scanner;
public class Pattern9 {
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
        for(int i=1;i<=row;i++)
      {                                       
             for(int j=1;j<=row-i;j++)
            {
            System.out.print(" "); // to print spaces

             }
             for(int k=1;k<=2*i-1;k++)
           {
            System.out.print("*"); //to print stars
            }
        System.out.println("");
        
      }
    }
    
}