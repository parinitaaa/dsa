// if input is 5
  //             * 
  //         *   *   *   
  //    *    *   *   *    *
  //         *   *   *   
  //             * 
//if input is 7
//       *          //3 spaces before and after *
//     * * *        // 2 spaces bfore and after *
//   * * * * *       // 1
// * * * * * * *     // 0
//   * * * * *       //1
//     * * *         //2
//       *           //


import java.util.Scanner;

public class Pattern4 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an odd number");
        int num=sc.nextInt();
        int x=num/2;
        int y=1;
        sc.close();
        if(num%2!=0)
        {
            for(int i=1;i<=(num/2)+1;i++)
            {
                for(int j=1;j<= x;j++ )
                {
                System.out.print("  ");
                }
                for(int k=1;k<=y;k++)
                {
                    System.out.print("* ");
                }
                for(int j=1;j<= x;j++ )
                {
                System.out.print("  ");
                }
                System.out.println(" ");
                y=y+2;
                x--;
              
            }
            
            x=1; //number of spaces
            y=num-2;//number of stars
             for(int i=1;i<=(num/2);i++)
             {
                 for(int j=1;j<=x;j++)
                 {
                        System.out.print("  ");
                 }
                 for(int k=1;k<=y;k++)
                 {
                     System.out.print("* ");
                 }
                 for(int j=1;j<= x;j++ )
                {
                System.out.print("  ");
                }
                System.out.println(" ");
                y=y-2;
                x++;
                 
             }

        }
        
        else if(num==0)
        {
            System.out.println(" ");
        }
        else if (num%2==0)
        {
            System.out.println("even number cannot form a diamond ");
        }
        
    }
    
}
