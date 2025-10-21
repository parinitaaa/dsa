//package recursion;
import java.util.Scanner;
public class RecursionSumofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        int num=sc.nextInt();
        sc.close();
       int x=sum(num);
       System.out.println(x);
}
static int sum(int num)
{
    if(num==0)
    return 0;
    return num%10+sum(num/10);
}
}