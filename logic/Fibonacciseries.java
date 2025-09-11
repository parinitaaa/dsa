package logic;
import java.util.Scanner;
public class Fibonacciseries
{
    public static void main(String [] args)
     {
    Scanner sc = new Scanner(System.in);
      int a=0;
      int b=1;
      int temp=0;
      System.out.println("enter number of numbers to be printed");
      int n=sc.nextInt();
      int count=0;
      System.out.print(a+" "+b+" ");

      while(count<(n-2))
      {
         temp =a+b;
         a=b;
         b=temp;
         System.out.print(temp+" ");
         count++;
      }

       sc.close();
    }
}