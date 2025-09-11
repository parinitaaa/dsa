package logic;
import java.util.Scanner;
public class CountingOccurences
{
    public static void main(String [] args)
     {
       Scanner sc = new Scanner(System.in);
      {
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("enter the digit you want to check");
        int dig=sc.nextInt();
        int count=0;
        while(num>0)
        {
           int rem=num%10;
            if(rem==dig)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println("the number of times "+ dig+ " occurred is " + count);
        sc.close();
     }
    }
}
