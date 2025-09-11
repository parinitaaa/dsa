package logic;
import java.util.Scanner;
public class Maxofthreenumbers 
{
    public static void main (String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter three numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int max=a;
    if(b>max)
    {
        max=b;
    }
     if(c>max)
    {
        max=c;
    }
    System.out.println("max is "+ max );
    // Math.max(a,Math.max(b,c))
    sc.close();
} 
}
