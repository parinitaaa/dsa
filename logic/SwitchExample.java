package logic;
import java.util.Scanner;
public class SwitchExample 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fruit");
        String input = sc.next();
        System.out.println("enter number");
        int num= sc.nextInt();
        switch (input)
        {
           case "mango": System.out.println("yellow");
                        break;
            case "apple": System.out.println("red");
                          break;
            case "orange": System.out.println("orange");
                            break;
            case "grape": switch(num)
                         {
                            case 1: System.out.println("ONE GRAPE");
                            break;
                            case 2: System.out.println("TWO GRAPE");
                            break;
                            default: System.out.println(num+ " GRAPES");
                         }
                         break;
            default: System.out.println("invalid choice");
             
        //enhanced switch
             //case "apple","banana" -> System.out.println("red yellow");
          //  case "gauva", "grapes" -> System.out.println("green");
           // default -> System.out.println("invalid");

        }
        sc.close();
    }
    
}
