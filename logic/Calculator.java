package logic;
import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int res=0;
        while(true)
        {
            System.out.println("enter operator and enter x or X to exit");
            char op=sc.next().trim().charAt(0);
              // trim() - removes the spaces before typing
              // charAt(x) - gives the character at the xth index of the string
            if( op=='+' || op=='-'|| op=='*' ||op=='/' ||op=='%' || op=='^' )
            {
                System.out.println("enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op=='+') 
                {
                   res = a+b;
                }
                else if(op=='-')
                {
                   res = a-b;
                }
                else if(op=='*')
                {
                   res = a*b;
                }
                else if(op=='/')
                {
                    if(b!=0) // checks if denominator is not zero
                    {
                     res = a/b;
                    }
                    else
                    {
                     System.out.println("infinity");
                     continue;
                    }
                }
                else if(op=='%')
                {
                    if(b!=0) // checks if denominator is not zero
                    {
                   res = a%b;
                    }
                    else
                    {
                     System.out.println("invalid");
                     continue;
                    }
                }
                else if(op=='^')
                {
                   res = (int) Math.pow(a,b); //Math.pow() returns in double therefore typecasting is necessary
                }
                else 
                {
                   System.out.println("invalid operator");
                }
                System.out.println("answer is "+ res);
                 

            }
            else if( op== 'x' || op == 'X')
            {
                sc.close();
                System.out.println("exiting...");
                System.exit(0); // exiting -> System.exit(0);
            }
            else
            {
                System.out.println("invalid choice");
            }
        }
    
      
    }
    
}
