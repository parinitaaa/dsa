
// *****  1            //*   2                //1         3
// ****                //**                   //1 2 
// ***                 //***                  //1 2 3 
// **                  //****                 //1 2 3 4
// *                   //*****                //1 2 3 4 5 

// *     4
// ** 
// *** 
// **** 
// *****
// ****
// ***
// **
// *




import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        System.out.println("enter");
        int x=sc.nextInt();
        sc.close();
        switch(x)
        {
            case 1: pattern1(row);
            break;
            case 2: pattern2(x,row);
            break;
            case 3: pattern2(x,row);
            break;
            case 4: pattern2(x,row);
            pattern1(row);
            break;
            
        }
    
    }
    public static void pattern1(int row)
    {
        for(int i=row;i>=1;i--)
        {
             for(int j=1;j<=i;j++)
             {
                 
                 System.out.print("*");
             }
             System.out.println(" ");
        }
    }
    public static void pattern2(int x, int row)
    {
        outerloop:
        for(int i=1;i<=row;i++)
        {
             for(int j=1;j<=i;j++)
             {
                 if(x==2 )
                 System.out.print("*");
                 else if(x==3)
                 System.out.print(j);
                 else  // for x=4
                 {
                    if(i==row)
                    break outerloop;           // this breaks the outer loop as well
                    else
                    System.out.print("*");

                 }
             }
             System.out.println(" "); //if (x==2 || x==3|| x==4)
                                        // {
                                        //    if (x==4 && i!=row-1)
                                        //      System.out.println(" ");
                                        //  }
             
        }
    }
}
