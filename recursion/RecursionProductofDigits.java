//package recursion;
import java.util.Scanner;
public class RecursionProductofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        int num=sc.nextInt();
        sc.close();
       int x=prod(num);
       System.out.println(x);
}
static int prod(int num)
{
    if(num==0) //if one digit is remaining, return that digit only-> n%10==n then return n
    return 1;
    return num%10*prod(num/10);
}
}
