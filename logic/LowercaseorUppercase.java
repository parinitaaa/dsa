package logic;
import java.util.Scanner;
public class LowercaseorUppercase
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a character");
        char ch= sc.next().trim().charAt(0);
        // trim() - removes the spaces before typing
        // charAt(x) - gives the character at the xth index of the string
        if(ch >= 'a' && ch<='z')
        {
            System.out.println(ch+ " is LOWERCASE");
        }
        else if(ch >='A' && ch <= 'Z')
        {
            System.out.println(ch+ " is UPPERCASE");
        }
        else
        System.out.println("invalid input");
        sc.close();
    }
    
}
