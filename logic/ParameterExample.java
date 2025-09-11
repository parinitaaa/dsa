package logic;
import java.util.Scanner;
public class ParameterExample 
{
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your name");
       String name = sc.nextLine();
        String x = greet(name);
        System.out.println(x);
        sc.close();
      
    }

    
    static String greet(String x)
    {
        String z ="Hello "+ x;
        return z;
    }
   
}
