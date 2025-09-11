//       *
//      **
//     ***
//    ****
//   *****

//    *****
//     ****
//      ***
//       **
//        *

import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and columns");
        int row = sc.nextInt();
        int col=sc.nextInt();
        System.out.println("enter 1 or 2");
        int input = sc.nextInt();
        if(input==1)
        {
            pattern1(row,col);
        }
        else if(input==2)
        {
            pattern2(row,col);
        }
        else
        System.out.println("wrong input");
        sc.close();
    }

        
    public static void pattern1(int row, int col){
    int x=row;
    for(int i=1;i<=row;i++)
    {                                       
        for(int j=1;j<=col;j++)
        {
            if(j>=x)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println("");
        x--;
    }
}
public static void pattern2(int row, int col){
    
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=col;j++)
        {
            if(j>=i)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
       
    }
}
    
}
