 //          *           if input is 7
 //        *   * 
 //       *     * 
 //      *       * 
 //       *     * 
 //        *   * 
 //          * 

 //        *             if input is 5
 //      *   * 
 //     *     * 
 //      *   * 
 //        * 

 
import java.util.Scanner;

public class Pattern5
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an odd number");
        int num=sc.nextInt();
        int x=num/2; //no. of spaces
       
        sc.close();
        if(num%2!=0)
        {
            for(int i=0;i<(num/2)+1;i++)  //upper loop
            {
                for(int j=1;j<=x;j++)
                {
                    System.out.print("  "); //spaces before *
                }
                System.out.print("*");
                
                if(i>0) //i dont want to print any stars for the first row
                { 
                    for(int l=1;l <= (2*i)-1;l++)
                    {
                        System.out.print("  "); // spaces between the stars
                    }
                     System.out.print("*"); 
                    
                }
                System.out.println();
                x--;
                
            }
            x=num/2;
            for (int i =0;i<(num/2);i++) //lowerhalf
            {
              for(int j=0;j<=i;j++)
              {
                System.out.print("  "); //spaces before *
              } 
              System.out.print("*");
                
                if(i!=(num/2)-1) //i dont want to print any stars for the last row
                { 
                    for(int l=1;l <= x;l++)   
                    {
                        System.out.print("  "); // spaces between the stars
                    }
                     System.out.print("*"); 
                    
                }
                System.out.println();
                x=x-2;

            }
        }
        else
        {
            System.out.println("invalid");
        }
    }
    
}

// OTHER METHOD USING 2D ARRAYS
//int InputOddNum = 7;

//int VarMid = InputOddNum / 2 ;

//char[][] myArray = new char[InputOddNum][InputOddNum];

//char DisplayValue = '*';

//System.out.print("InputOddNum=" + InputOddNum);

//System.out.print("VarMid=" + C);

//int temp=0;

//int increment=1;

//for (int i = 0; i < InputOddNum; i++) 
//{
  //  for (int j = 0; j < InputOddNum; j++) 
   // {

     //   myArray[i][j] = ' '; //initializing the array

   // }

//}

//for (int i = 0; i < InputOddNum; i++) {

  //      if (i == 0 || i == (InputOddNum-1))  //first&last row
    //    {

      //      myArray[i][(VarMid)] = DisplayValue;

        //}

        //else if (i <= VarMid) //upperhalf
      //{

//            myArray[i][(VarMid-i)] = DisplayValue;

  //          myArray[i][(VarMid+i)] = DisplayValue;

    //    }

      //  else   //lowerhalf
       // {

         //   myArray[i][(i-VarMid)] = DisplayValue;

          //  temp = (i+VarMid)-(i-VarMid+increment); //formula 

          //  myArray[i][temp] = DisplayValue;

          //  increment = increment + 1;

      //  }

// }

//for (int i = 0; i < InputOddNum; i++) {

  //  System.out.print("\n");

    //for (int j = 0; j < InputOddNum; j++) {

      //  System.out.print(myArray[i][j] + " "); //display

     // }

// }

